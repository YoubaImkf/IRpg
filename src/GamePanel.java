import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel implements Runnable{

    final int originalSize = 16; // 16 X 16 tile
    final int scale = 3;
    public final int tileSize = originalSize * scale; // 48 X 48
    public final int maxScreenCol = 15; // 16
    public final int maxScreenRow = 10; // 12
    public final int screenWidth = tileSize * maxScreenCol;  // 720px
    public final int screenHeight = tileSize * maxScreenRow; // 480px

    //State of the Game
    public int gameState; // state of the game
    public int titleState = 0;

    private Thread gameThread ; // Object Thread to repaint screen each 60
    public KeyHandler keyHandler =  new KeyHandler(this); // Object that store key press

    public UI ui = new UI(this);
    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.getHSBColor(24,155,120));
        this.setDoubleBuffered(true); // +performance
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    public void StartGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() { // How to make the game run at 60fps
        double deltaTime;
        long OldTime = System.nanoTime();
        long currentTime;
        long accumulator = 0;

        while(gameThread != null){
            currentTime = System.nanoTime();
            deltaTime = (currentTime - OldTime);
            accumulator +=  deltaTime;
            OldTime = currentTime;

            while(accumulator > 1.0/60.0) {
                repaint(); // Clears the graphic on the panel and executes the PAINTCOMPONENT method to redraw the graphics on this pane
                accumulator -= 1.0/60.0;
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D)g;

        if(gameState == titleState){
            ui.drawUI(graphics2D);
        }
        graphics2D.dispose();
    }



}
