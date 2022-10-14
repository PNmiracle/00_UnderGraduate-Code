import javax.swing.*;

/**
 * @Author mapKey
 * @Date 2022-10-13-2:55 PM1
 */
public class MyDemo {
    public static void main(String[] args) {
        //窗口和标题
        //JFrame frame = new JFrame("Swing Example");

        JFrame frame = new MyFrame("Twin-Cal");
        //关闭窗口,退出程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //窗口大小设置
        frame.setSize(1000, 800);
        //显示窗口
        frame.setVisible(true);
    }
}
