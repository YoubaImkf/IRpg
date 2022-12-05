import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Interface-RPG");
//        window.setLayout(null);
//        window.setVisible(true);
        GamePanel gamePanel = new GamePanel();

        // center the window

//        JPanel titleNamePanel = new JPanel();
//        titleNamePanel.setBounds(100,100,600,150);
//        titleNamePanel.setBackground(Color.orange);
//        JLabel titleNameLabel = new JLabel("RPG");
//        titleNameLabel.setForeground(Color.white);
//        titleNameLabel.setFont(new Font("Comics Sans MS", Font.PLAIN, 90));
//
//        titleNamePanel.add(titleNameLabel);
//
////        gamePanel.add(titleNameLabel);
//        gamePanel.add(titleNamePanel);
//        JButton startButton = new JButton("Start");
//        gamePanel.add(startButton );

        window.add(gamePanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.StartGameThread();
    }

}