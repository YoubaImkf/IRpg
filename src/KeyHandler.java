import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
//    public boolean up, down, right, left;
    private final GamePanel gamePanel;

    public KeyHandler(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(gamePanel.gameState == gamePanel.titleState){ // Press Enter to Start the game
            if (keyCode == KeyEvent.VK_DOWN){
                gamePanel.ui.commandNum--; // move down on menu
                if(gamePanel.ui.commandNum < 0){
                    gamePanel.ui.commandNum = 1;
                }
            }
            if (keyCode == KeyEvent.VK_UP){
                gamePanel.ui.commandNum++; // move up
                if(gamePanel.ui.commandNum > 1){
                    gamePanel.ui.commandNum = 0;
                }
            }
            if (keyCode == KeyEvent.VK_ENTER){
                if(gamePanel.ui.commandNum == 0){
                    System.out.println("game is playing");
                } else if(gamePanel.ui.commandNum == 1){ System.exit(0);}
            }



//            if (keyCode == KeyEvent.VK_UP){
//                up = true;
//            }
//            if (keyCode == KeyEvent.VK_DOWN){
//                down = true;
//            }
//            if (keyCode == KeyEvent.VK_LEFT){
//                left = true;
//            }
//            if (keyCode == KeyEvent.VK_RIGHT){
//                right = true;
//            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        int keyCode = e.getKeyCode();
//
//        if (keyCode == KeyEvent.VK_UP){
//            up = false;
//        }
//        if (keyCode == KeyEvent.VK_DOWN){
//            down = false;
//        }
//        if (keyCode == KeyEvent.VK_LEFT){
//            left = false;
//        }
//        if (keyCode == KeyEvent.VK_RIGHT){
//            right = false;
//        }
    }
}
