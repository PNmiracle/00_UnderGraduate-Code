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
     * ����������������̰�ĳ���������·������ÿ�ζ�����ʼ���Ҹ�������ĵ�ȥ̰�ı���
     *
     * @return ����ó��ı����ڵ�˳��
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
     * ʵ�ֽ��滥�����������������ͬ�������Ȼ�󽻻�������λ�õĵ�
     * ���⻹����λ��, ���÷���
     *
     * @param rout
     * @return ���������������·��
     */
    public int[] swap(int[] rout) {
        Random random = new Random();
        //int r1 = random.nextInt(rout.length);   //�������һ����Χ��[0..rout.length)������
        int r1 = random.nextInt(rout.length - 2) + 1;   //�������һ����Χ��[1..rout.length - 1)������
        //int r2 = random.nextInt(rout.length);
        int r2 = random.nextInt(rout.length - 2) + 1;
        while (r1 == r2) {
            r2 = random.nextInt(rout.length - 2) + 1;   //��֤�����r1, r2��ͬ
        }
        int[] change = copyRout(rout);
        int tmp = change[r1];
        change[r1] = change[r2];
        change[r2] = tmp;
        return change;
    }

    /**
     * ģ���˻��㷨SA
     *
     * @param rout �������ڵ�����·��
     * @param T0   ��ʼ�¶�
     * @param d    �¶�˥���ʣ�0.98
     * @param Tk   ����¶�
     * @param L    ��ѭ������
     * @return ����õ�������·��
     */
    public int[] Sa_TSP(int[] rout, double T0, double d, double Tk, int L) {
        // T0=1e5,d =1-7e-3, Tk=1e-3
        // T0=1e6,d =0.99, Tk=1e-6
        int[] bestpath, curentpath;
        //t:�˿̵��¶ȱ���
        double t = T0;
        // ��ʼʱ��:�������ӽ�rout��curentpath,�� bestpath��
        bestpath = curentpath = copyRout(rout);
        Random random = new Random();
        while (t > Tk) {        // ���ﵽ����¶�ʱֹͣѭ��
            int it = 0;        //Ϊ��֤�������̵ĳ���,��ͬһ�¶���, ������Ҫ���ж������,������ѭ���Ĵ���
            while (it < L) {
                int[] update_path = swap(curentpath);//�ڵ�ǰ��A������������½�B,�˴��ý�����
                int delta = cost(update_path) - cost(curentpath);
                if (delta < 0) {//Ϊ��ֵ��������ɱ������ˣ������
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
        System.out.println("�ܳ��ȣ�" + cost(rout));
        System.out.print("��·�ߣ�" + rout[0] + "(���B)");
        for (int i = 1; i < rout.length - 1; i++) {
            System.out.print("->" + rout[i]);
        }
        System.out.print("->" + rout[rout.length - 1] + "(�յ�A)" );
    }

    public static void main(String[] args) throws IOException {
        TspProblem problem = TspReader.readTSP("resources/eil51.txt", 12);
        SA sa = new SA(problem);
        //����̰�ĵ�BFS�ҵ�һ���ȽϺõ����ӽ�(һ�����), Ҳ�����������һ�����ӽ�
        //int[] rout = sa.BFS();
        /*һ���������n + 2����, ��ŷֱ�Ϊ[0...N-1], ����0ΪB��(��������ʼ��), n + 1Ϊ�յ�A(���������), ������Ϊ������*/
        System.out.println("���������ɵ�����Ͱ����Ŀ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] rout = new int[n + 2];//Java������Ĭ�ϳ�ʼ��rout[0] = 0;
        rout[rout.length - 1] = n + 1;
        sa.build_random_sequence(rout);
        /* ---------------------- ����ģ���˻��㷨 ------------------------- */
        double T0 = 1e6;        //��ʼ�¶�
        double d = 0.99;        //�¶�˥��ϵ��
        double Tk = 1e-6;       //����¶�
        int L = 20 * rout.length;//��ѭ������, Ҳ���Ը�ֵΪһ���ϴ�ĳ���

        int[] rout2 = sa.Sa_TSP(rout, T0, d, Tk, L);
        sa.print(rout2);
    }

    /*��rout[1..n]��ֵΪ[1...n]�Ĳ��ظ�������*/
    public void build_random_sequence(int[] rout) {
        int n = rout.length - 2;
        int[] numbers = new int[n];
        // numbers���[1..n]
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 1; i <= rout.length - 2; i++) {
            //Math.random() :[0, 1) ��double
            //r:[0..n - 1] ������
            int r = (int) (Math.random() * n);
            rout[i] = numbers[r];
            /*ÿ�����ɵ��±����п����ظ��ģ���������numbers��������±��Ӧ��ֵÿ����һ�Σ�
            �ͱ��߳�ȥ�ˣ��滻����n-1λ���ϵ�ֵ�����������ս���������ظ�*/
            numbers[r] = numbers[n - 1];
            n--;
        }
    }

}
