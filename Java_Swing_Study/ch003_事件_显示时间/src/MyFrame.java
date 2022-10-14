import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author mapKey
 * @Date 2022-10-14-2:37 PM
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
        //容器
        JPanel root = new JPanel();
        this.setContentPane(root);
        //控件
        JButton button = new JButton("测试");
        root.add(button);
        /*label控件*/
        JLabel timeLabel = new JLabel("00:00:00");
        root.add(timeLabel);

        //绑定监听器, ActionListener接口实现类的对象,或者内部类
        button.addActionListener((e -> {
            System.out.println("** 按钮被点击了");

            SimpleDateFormat sdf = new SimpleDateFormat("HH :mm :ss");
            String timeStr = sdf.format(new Date());
            System.out.println("timeStr = " + timeStr);

            timeLabel.setText(timeStr);
        }));
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("** 按钮被点击了");

                SimpleDateFormat sdf = new SimpleDateFormat("HH :mm :ss");
                String timeStr = sdf.format(new Date());
                System.out.println("timeStr = " + timeStr);

                *//*作用域ok*//*
                timeLabel.setText(timeStr);
            }
        });*/



    }
}
