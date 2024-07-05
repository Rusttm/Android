
import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;
    JButton btnStart = new JButton("New Game");
    JButton btnExit = new JButton("Exit");

    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe");
        setResizable(true);
        JPanel panBottom = new JPanel();
        GridLayout twoButtonsLayout = new GridLayout(1,2);
        panBottom.setLayout(twoButtonsLayout); 
        panBottom.add(btnStart);
        panBottom.add(btnExit);
        add(panBottom);
        setVisible(true);
    }
    // public static void main(String[] args) {
        
    // }

}
