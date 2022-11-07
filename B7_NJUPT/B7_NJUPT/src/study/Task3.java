package study;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    private static int maxMine = 99;
    private static int cols = 30;
    private static int rows = 16;
    private static String str = "-";
    private static String[] validPosition = new String[cols * rows];
    private static String[] finalPosition = new String[maxMine];
    private static String[] finalPosition_x = new String[maxMine];
    private static String[] finalPosition_y = new String[maxMine];
    private static int[] num_c = new int[cols * rows];
    private static int[] test = new int[maxMine];

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int validNumber = 0;
        for (int i = 0; i < cols; i++) {
            for (int k = 0; k < rows; k++) {
                validPosition[validNumber] = String.valueOf(k) + str + String.valueOf(+i);
                validNumber++;
            }
        }
//		System.out.println("现在输出一遍二维下标。"+Arrays.toString(validPosition));
        //初始化待抽数组
        for (int k = 0; k < cols * rows; k++) {
            num_c[k] = k;
        }
//		System.out.println("现在输出一遍基数。"+Arrays.toString(num_c));
        int index = -1;//记录下标
        int flag = -1;//记录随机到的坐标
//		String str1 = "";
        Random ran = new Random();
        for (int b = 0; b < maxMine; b++) {
            index = ran.nextInt(num_c.length - b - 1);

            flag = num_c[index];
            test[b] = flag;

            finalPosition[b] = validPosition[flag];

//			str1 = validPosition[flag];
//			validPosition[flag] = validPosition[validPosition.length - b -1];
//			validPosition[validPosition.length - b -1] = str1;

//			int flow = num_c[index];
            num_c[index] = num_c[num_c.length - b - 1];
            num_c[num_c.length - b - 1] = flag;


        }

        System.out.println("现在输出一遍最终数组的值。" + Arrays.toString(finalPosition));
        int kfc = -1;
        for (int k = 0; k < maxMine; k++) {
            kfc = finalPosition[k].indexOf("-");
            finalPosition_x[k] = finalPosition[k].substring(0, kfc);
            finalPosition_y[k] = finalPosition[k].substring(kfc + 1);
        }
        for (int d = 0; d < maxMine; d++) {
            int ro = Integer.parseInt(finalPosition_x[d]);
            int co = Integer.parseInt(finalPosition_y[d]);
            System.out.printf("(%d %d)", ro, co);
        }
    }

}

