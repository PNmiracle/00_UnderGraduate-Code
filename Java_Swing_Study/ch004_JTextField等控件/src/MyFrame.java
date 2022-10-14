import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author mapKey
 * @Date 2022-10-13-5:31 PM
 */
//窗口
public class MyFrame extends JFrame {
    //设置文本框长度
    JTextField textField = new JTextField(20);
    JCheckBox agreeField = new JCheckBox("同意用户协议");
    JButton nextButton = new JButton("下一步");


    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);
        /*============下拉列表控件=====================*/
        JComboBox<String> colorField = new JComboBox<>();
        root.add(colorField);
        colorField.addItem("红");
        colorField.addItem("黄");
        colorField.addItem("蓝");
        colorField.addItem("绿");





        /*=================复选框控件=====================*/
        //JCheckBox agreeField = new JCheckBox("同意用户协议");*****提升作用域****
        root.add(agreeField);
        //JButton nextButton = new JButton("下一步");
        root.add(nextButton);
//=====相关API=====================================
        //界面初始化
        agreeField.setSelected(false);
        nextButton.setEnabled(false);

        agreeField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (agreeField.isSelected()) {
                    nextButton.setEnabled(true);
                } else {
                    nextButton.setEnabled(false);
                }
            }
        });



        /*=============文本控件==============*/

        root.add(textField);
        textField.setText("My Twin-Calculator");

        JButton button = new JButton("AC");
        root.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test();
            }
        });
    }

    private void test() {
        String str = textField.getText();
        System.out.println("str = " + str);
    }
}
