import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class Minesweeper {
    JFrame frame = new JFrame("Minesweeper");
    JLabel textLabel = new JLabel();
    GamePanel gamePanel;
    JButton newGameButton = new JButton("New Game");

    int mineCount = 10;
    int numRows = 8;
    int numCols = numRows;
    int tileSize = 70;


    public Minesweeper() {
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Minesweeper: " + mineCount);
        textLabel.setOpaque(true);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        gamePanel = new GamePanel(numRows, numCols, mineCount, textLabel);
        frame.add(gamePanel, BorderLayout.CENTER);

        frame.add(newGameButton, BorderLayout.SOUTH);
        newGameButton.addActionListener(e -> gamePanel.resetGame());

        frame.setVisible(true);
    }
}
