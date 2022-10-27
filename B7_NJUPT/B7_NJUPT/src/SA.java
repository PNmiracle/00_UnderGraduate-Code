import util.TspProblem;
import util.TspReader;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class SA {

    TspProblem problem;

    public SA(TspProblem problem) {
        this.problem = problem;
    }

    /**
     * 广度优先搜索，输出贪心出来的最优路径，即每次都从起始点找附近最进的点去贪心遍历
     *
     * @return 输出得出的遍历节点顺序
     */
    public int[] BFS() {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int[] vis = new int[problem.getxCoors().length];
        int[] out = new int[problem.getxCoors().length];
        vis[0] = 1;
        int totalDist = 0;
        int index = 1;
        while (!q.isEmpty()) {
            int front = q.poll();
            int min = Integer.MAX_VALUE;
            int sIdx = 0;
            for (int i = 0; i < problem.getxCoors().length; i++) {
                if (vis[i] == 0 && i != front && min > problem.getDistance()[front][i]) {
                    min = problem.getDistance()[front][i];
                    sIdx = i;
                }
            }
            if (min != Integer.MAX_VALUE) {
                vis[sIdx] = 1;
                q.add(sIdx);
                out[index] = sIdx;
                index++;
                totalDist += problem.getDistance()[front][sIdx];
            }
        }
        q = null;
        totalDist += problem.getDistance()[out[out.length - 1]][0];
        return out;
    }

    public int cost(int[] rout) {
        int sum = 0;
        int[][] dist = problem.getDistance();
        for (int i = 0; i < rout.length - 1; i++) {
            sum += dist[rout[i]][rout[i + 1]];
        }
        sum += dist[rout[rout.length - 1]][rout[0]];
        return sum;
    }

    public int[] copyRout(int[] rout) {
        int[] out = new int[rout.length];
        for (int i = 0; i < rout.length; i++)
            out[i] = rout[i];
        return out;
    }

    /**
     * 实现交叉互换，随机出两个不相同随机数，然后交换那两个位置的点
     * 此外还有移位法, 倒置法等
     *
     * @param rout
     * @return 输出经过交换的新路径
     */
    public int[] swap(int[] rout) {
        Random random = new Random();
        //int r1 = random.nextInt(rout.length);   //随机产生一个范围在[0..rout.length)的整数
        int r1 = random.nextInt(rout.length - 2) + 1;   //随机产生一个范围在[1..rout.length - 1)的整数
        //int r2 = random.nextInt(rout.length);
        int r2 = random.nextInt(rout.length - 2) + 1;
        while (r1 == r2) {
            r2 = random.nextInt(rout.length - 2) + 1;   //保证随机数r1, r2不同
        }
        int[] change = copyRout(rout);
        int tmp = change[r1];
        change[r1] = change[r2];
        change[r2] = tmp;
        return change;
    }

    /**
     * 模拟退火算法SA
     *
     * @param rout 输入用于迭代的路径
     * @param T0   初始温度
     * @param d    温度衰减率，0.98
     * @param Tk   最低温度
     * @param L    内循环次数
     * @return 输出得到的最优路径
     */
    public int[] Sa_TSP(int[] rout, double T0, double d, double Tk, int L) {
        // T0=1e5,d =1-7e-3, Tk=1e-3
        // T0=1e6,d =0.99, Tk=1e-6
        int[] bestpath, curentpath;
        //t:此刻的温度变量
        double t = T0;
        // 起始时刻:复制种子解rout到curentpath,和 bestpath中
        bestpath = curentpath = copyRout(rout);
        Random random = new Random();
        while (t > Tk) {        // 当达到最低温度时停止循环
            int it = 0;        //为保证搜索过程的彻底,在同一温度下, 我们需要进行多次搜索,设置内循环的次数
            while (it < L) {
                int[] update_path = swap(curentpath);//在当前解A附近随机产生新解B,此处用交换法
                int delta = cost(update_path) - cost(curentpath);
                if (delta < 0) {//为负值，即结果成本降低了，则接受
                    curentpath = update_path;
                    bestpath = update_path;
                } else {
                    double p = Math.exp(-delta / t);
                    if (random.nextDouble() <= p) {
                        curentpath = update_path;
                    }
                }
                it++;
            }
            t *= d;
        }
        return bestpath;
    }

    public void print(int rout[]) {
        System.out.println("总长度：" + cost(rout));
        System.out.print("总路线：" + rout[0] + "(起点B)");
        for (int i = 1; i < rout.length - 1; i++) {
            System.out.print("->" + rout[i]);
        }
        System.out.print("->" + rout[rout.length - 1] + "(终点A)" );
    }

    public static void main(String[] args) throws IOException {
        TspProblem problem = TspReader.readTSP("resources/eil51.txt", 12);
        SA sa = new SA(problem);
        //先用贪心的BFS找到一个比较好的种子解(一种组合), 也可以随机产生一个种子解
        //int[] rout = sa.BFS();
        /*一共随机生成n + 2个点, 编号分别为[0...N-1], 其中0为B点(垃圾车起始点), n + 1为终点A(垃圾填埋点), 其他点为垃圾点*/
        System.out.println("请输入生成的垃圾桶的数目");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] rout = new int[n + 2];//Java中数组默认初始化rout[0] = 0;
        rout[rout.length - 1] = n + 1;
        sa.build_random_sequence(rout);
        /* ---------------------- 调用模拟退火算法 ------------------------- */
        double T0 = 1e6;        //初始温度
        double d = 0.99;        //温度衰减系数
        double Tk = 1e-6;       //最低温度
        int L = 20 * rout.length;//内循环次数, 也可以赋值为一个较大的常量

        int[] rout2 = sa.Sa_TSP(rout, T0, d, Tk, L);
        sa.print(rout2);
    }

    /*给rout[1..n]赋值为[1...n]的不重复的序列*/
    public void build_random_sequence(int[] rout) {
        int n = rout.length - 2;
        int[] numbers = new int[n];
        // numbers存放[1..n]
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 1; i <= rout.length - 2; i++) {
            //Math.random() :[0, 1) 的double
            //r:[0..n - 1] 的整数
            int r = (int) (Math.random() * n);
            rout[i] = numbers[r];
            /*每次生成的下标是有可能重复的，但是由于numbers数组里该下标对应的值每抽中一次，
            就被踢出去了（替换成了n-1位置上的值），所以最终结果并不会重复*/
            numbers[r] = numbers[n - 1];
            n--;
        }
    }

}
