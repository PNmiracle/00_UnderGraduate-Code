package my;

import javax.swing.*;
import java.awt.*;

/**
 * @Author mapKey
 * @Date 2022-10-13-5:31 PM
 */
//窗口
public class MyFrame extends JFrame {
    public MyFrame(String title) {
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
        label.setFont(new Font("微软雅黑",Font.BOLD, 30));
        label.setForeground(new Color(0, 0, 255));

        label.setOpaque(true);
        label.setBackground(new Color(0,255,255));

        label.setPreferredSize(new Dimension(600, 300));

        label.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
