import javax.swing.*;
import java.awt.*;

public class Grid{
    JFrame jFrame;

    Grid() {
        initUI();
    }

    public void initUI() {
        jFrame = new JFrame();

        JButton btn[] = new JButton[9];
        for (int i=0; i<9; i++) {
            btn[i] = new JButton(Integer.toString(i+1));
            jFrame.add(btn[i]);
        }
        jFrame.setLayout(new GridLayout(3,3, 10, 10));
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Grid();
    }
}