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
        JPanel root = new JPanel();
        this.setContentPane(root);
        //root.getLayout();

        //FlowLayout flowLayout = new FlowLayout();
        //root.setLayout(flowLayout);

        root.setLayout(new BorderLayout());

        ColorLabel a1 = new ColorLabel("1", Color.YELLOW);
        ColorLabel a2 = new ColorLabel("2", Color.RED);
        ColorLabel a3 = new ColorLabel("3", Color.GREEN);
        ColorLabel a4 = new ColorLabel("4", Color.CYAN);

        //root.add(a1);
        //root.add(a2);
        //root.add(a3);
        //root.add(a4);

        root.add(a1, BorderLayout.NORTH);
        root.add(a3, BorderLayout.WEST);
        root.add(a3, BorderLayout.EAST);
        root.add(a3, BorderLayout.CENTER);
        root.add(a4, BorderLayout.SOUTH);
        a1.setPreferredSize(new Dimension(250, 500));
    }

    private class ColorLabel extends JLabel {
        public ColorLabel(String text, Color color) {
            super(text);
            this.setOpaque(true);
            this.setBackground(color);
            this.setPreferredSize(new Dimension(60, 30));
            this.setHorizontalAlignment(CENTER);
        }
    }

}
