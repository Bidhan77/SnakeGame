import javax.swing.*;

public class SnakeGame extends JFrame {
    private  GameBoard board;
    public SnakeGame() {
        board=new GameBoard();
        add(board);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
//        setBounds(100, 100, 400, 400);
        setVisible(true);
    }
        public static void main(String[] args){
            JFrame snakeGame=new SnakeGame();
    }
}
