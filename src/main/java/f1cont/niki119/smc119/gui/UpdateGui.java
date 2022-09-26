package f1cont.niki119.smc119.gui;

import javax.swing.*;
import java.awt.*;

public class UpdateGui extends JFrame {
    public static int w = 400;
    public static int h = 400;
    public UpdateGui(){
        super("Обновлятор");
        setBounds(
                Toolkit.getDefaultToolkit().getScreenSize().width / 2 - w / 2,
                Toolkit.getDefaultToolkit().getScreenSize().height / 2 - h / 2,
                w, h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
