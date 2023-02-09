package f1cont.niki119.smc119.gui;

import f1cont.niki119.smc119.tools.MinecraftLauncher;

import javax.swing.*;
import java.awt.*;

public class ГлавноеОкно extends JFrame {
    public GridBagConstraints gbc = new GridBagConstraints();
    public GridBagLayout gbl = new GridBagLayout();
    public JPanel panel = new JPanel(gbl);
    public JLabel описание_поля_версия = new JLabel("Версия:");
    public JComboBox<String> поле_версия = new JComboBox<>(new String[]{"1.12.2-forge"});
    public JLabel описание_поля_никнейм = new JLabel("Никнейм:");
    public JTextField поле_никнейм = new JTextField(16);
    public JButton кнопка_запуск = new JButton("Запуск");

    public int WIDTH = 400;
    public int HEIGHT = 400;
    public  ГлавноеОкно(){
        super("SMC119");
        setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2-WIDTH/2, Toolkit.getDefaultToolkit().getScreenSize().height/2-HEIGHT/2, WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        кнопка_запуск.addActionListener((a)->{
            MinecraftLauncher launcher = new MinecraftLauncher(1122,"niki119");
            launcher.launch();
        });
        gbc.insets = new Insets(5,5,5,5);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(описание_поля_версия, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        panel.add(поле_версия, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(описание_поля_никнейм, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        panel.add(поле_никнейм, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        panel.add(кнопка_запуск, gbc);
        add(panel);
    }
}
