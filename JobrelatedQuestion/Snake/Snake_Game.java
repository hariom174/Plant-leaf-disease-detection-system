package Snake;

import javax.swing.*;

 public class Snake_Game extends JFrame {

    Snake_Game() {

        super("Snake Game");
        add(new Board());
        pack();

        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Snake_Game();
    }
}
