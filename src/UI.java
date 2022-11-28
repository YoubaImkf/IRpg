import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class UI implements ActionListener {

    public GamePanel gamePanel;
    private Graphics2D graphics2D;
    public int commandNum = 0;

    public UI(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void drawUI(Graphics2D graphics2D){
        this.graphics2D = graphics2D;

        //Title state
        if(gamePanel.gameState == gamePanel.titleState){
            drawTitleScreen();
        }
    }


    private void drawTitleScreen() {
        try {
            // TEXT
            graphics2D.setColor(new Color(70,120,80));
            graphics2D.fillRect(0,0,gamePanel.screenWidth, gamePanel.screenHeight);
            graphics2D.setFont(graphics2D.getFont().deriveFont(Font.BOLD,80F));

            String text = "RPG INTERFACE";
            int x = getCenterScreen(text);
            int y = gamePanel.tileSize * 2;

            graphics2D.setColor(Color.black);
            graphics2D.drawString(text, x+5, y+5);

            graphics2D.setColor(Color.white);
            graphics2D.drawString(text, x, y);

            // IMAGE
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass()
                    .getResourceAsStream("images/New-Piskel.png")));
            x = gamePanel.screenWidth / 2 - (gamePanel.titleState /2) ;
            graphics2D.drawImage(image,x, y, gamePanel.tileSize * 3,gamePanel.tileSize * 3,null);

            // MENU
            graphics2D.setFont(graphics2D.getFont().deriveFont(Font.BOLD,45F));
            text = "PLAY";
            x = getCenterScreen(text);
            y +=  gamePanel.tileSize * 4.5;
            graphics2D.drawString(text, x, y);
            if(commandNum == 0){
                graphics2D.drawString("-", x - gamePanel.tileSize, y);
            }

            text = "QUIT";
            x = getCenterScreen(text);
            y +=  gamePanel.tileSize;
            graphics2D.drawString(text, x, y);
            if(commandNum == 1){
                graphics2D.drawString("-", x - gamePanel.tileSize, y);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private int getCenterScreen(String text){
        int lenght = (int)graphics2D.getFontMetrics().getStringBounds(text,graphics2D).getWidth();
        return gamePanel.screenWidth / 2 - lenght / 2; //  center element on the screen
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
