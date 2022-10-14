package my;

import javax.swing.*;

/**
 * @Author mapKey
 * @Date 2022-10-13-2:55 PM
 */
public class myDemo {
    public static void main(String[] args) {
        //窗口和标题
        JFrame frame = new JFrame("Swing Example");
        //关闭窗口,退出程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //容器(根容器), 面板
        JPanel root = new JPanel();
        frame.setContentPane(root);

        //控件(按钮)
        JButton button = new JButton("测试");
        root.add(button);

        //窗口大小设置
        frame.setSize(800, 600);
        //显示窗口
        frame.setVisible(true);
    }
}
