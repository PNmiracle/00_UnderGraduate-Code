package study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Rd {
    static Map setRd(int n) {
        Random out = new Random(System.currentTimeMillis());
        Map map = new HashMap();
        while (n > 0) {
            int x = out.nextInt(100);
            int y = out.nextInt(100);
            if (!map.containsValue("(" + x + "," + y + ")"))
                map.put(n--, "(" + x + "," + y + ")");
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("enter the numbers of your coordinate:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int c = Integer.parseInt(s);
        Map result = Rd.setRd(c);
        for (int a = 1; a < result.size() + 1; a++) {
            System.out.print(" " + result.get(a));
        }
    }
}
