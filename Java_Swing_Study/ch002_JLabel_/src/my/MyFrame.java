package my;

import javax.swing.*;

/**
 * @Author mapKey
 * @Date 2022-10-13-5:31 PM
 */
//窗口
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        //this.setTitle(title);
        super(title);
        //容器(根容器), 面板
        JPanel root = new JPanel();
        this.setContentPane(root);

        //控件1(按钮)
        JButton button = new JButton("测试");
        root.add(button);

        //
        JLabel label = new JLabel("mapKey");
        root.add(label);
        root.add(new JLabel("Hello"));
    }
}
