package f1cont.niki119.smc119;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SMC119 extends JFrame {

    public static void main(String[] args) {
        SMC119 smc119 = new SMC119();
    }

    public static int w = 400;
    public static int h = 400;

    public JPanel panel_question1 = new JPanel(new GridLayout(3, 1));
    public JLabel l_question1 = new JLabel("Ты гей?");
    public JButton b_q1_yes = new JButton("Да");
    public JButton b_q1_no = new JButton("Нет");
    public JPanel panel = new JPanel(new GridLayout(3, 1));

    public JLabel l_nickname = new JLabel("Ник:");
    public JTextField tf_nickname = new JTextField(20);
    public JButton b_start = new JButton("Играть");

    public SMC119() {
        super("SMC119");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(
                Toolkit.getDefaultToolkit().getScreenSize().width / 2 - w / 2,
                Toolkit.getDefaultToolkit().getScreenSize().height / 2 - h / 2,
                w, h);

        l_question1.setHorizontalAlignment(SwingConstants.CENTER);
        tf_nickname.setText("Player");

        panel_question1.add(l_question1);
        panel_question1.add(b_q1_yes);
        panel_question1.add(b_q1_no);

        add(panel_question1);

        b_q1_yes.addActionListener((event) -> {
            remove(panel_question1);
            add(panel);
            revalidate();
            repaint();
        });
        b_q1_no.addActionListener((event) -> {
            remove(panel_question1);
            add(new JLabel("Иди нахуй тогда"));
            revalidate();
            repaint();
        });

        panel.add(l_nickname);
        panel.add(tf_nickname);
        panel.add(b_start);

        b_start.addActionListener((event) -> {
            try {
                Launcher.start(tf_nickname.getText());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        setVisible(true);
    }
}