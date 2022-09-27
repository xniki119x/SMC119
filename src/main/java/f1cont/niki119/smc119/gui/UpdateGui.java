package f1cont.niki119.smc119.gui;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class UpdateGui extends JFrame {
    public static int w = 400;
    public static int h = 64;
    public JPanel panel = new JPanel(new FlowLayout());
    public JProgressBar pb_update_progress = new JProgressBar();
    public UpdateGui(){
        super("Обновление");
        setBounds(
                Toolkit.getDefaultToolkit().getScreenSize().width / 2 - w / 2,
                Toolkit.getDefaultToolkit().getScreenSize().height / 2 - h / 2,
                w, h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pb_update_progress.setIndeterminate(true);
        panel.add(pb_update_progress);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new UpdateGui();
    }
}
