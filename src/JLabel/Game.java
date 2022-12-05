package JLabel;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setTitle("Interface-RPG");
        window.setSize(800,600);
        window.setLayout(null);
        window.setVisible(true);
        window.setLocationRelativeTo(null);      // center the window
        Container con = window.getContentPane();


        JPanel titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.black);

        JLabel titleNameLabel = new JLabel("RPG");
        titleNameLabel.setForeground(Color.red);
        titleNameLabel.setFont(new Font("Comics Sans MS", Font.BOLD, 90));


        JPanel startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.black);

        JButton startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);


        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);

    }
}
