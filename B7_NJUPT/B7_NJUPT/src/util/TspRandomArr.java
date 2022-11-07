package util;

import java.util.*;

public class TspRandomArr {
    private static Map<Integer, String> setRd(int n) {
        Random out = new Random(System.currentTimeMillis());
        Map<Integer, String> map = new HashMap();
        while (n > 0) {
            int x = out.nextInt(100);
            int y = out.nextInt(100);
            if (!map.containsValue(x + "," + y))
                map.put(n--, x + "," + y);
        }
        return map;
    }
    /*随机生成不重复的n+2个坐标*/
    public static List<int[]> ranCorArr(int n){
        List<int[]> ranCorArrs = new ArrayList<>();
        int[] xCoors = new int[n + 2];
        int[] yCoors = new int[n + 2];

        Map<Integer, String> map = setRd(n + 2);
        for (int i = 1; i < map.size() + 1; i++) {
            String s = map.get(i);
            String delimeter = ",";  // 指定分割字符
            String[] split = s.split(delimeter);
            xCoors[i - 1] = Integer.parseInt(split[0]);
            yCoors[i - 1] = Integer.parseInt(split[1]);
        }
        ranCorArrs.add(xCoors);
        ranCorArrs.add(yCoors);

        return ranCorArrs;
    }

    public static TspProblem generate_problem(int n) {
        List<int[]> list = TspRandomArr.ranCorArr(n);
        int[] xCoors = list.get(0);
        int[] yCoors = list.get(1);
        TspProblem tspProblem = new TspProblem(xCoors, yCoors);
        return tspProblem;
    }
}
