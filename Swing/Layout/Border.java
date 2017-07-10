import javax.swing.*;
import java.awt.*;

public class Border {
    JFrame jFrame;
    Border() {
        jFrame = new JFrame();
        JButton labelNorth = new JButton("North");
        JButton labelSouth = new JButton("South");
        JButton labelEast = new JButton("East");
        JButton labelWest = new JButton("West");
        JButton labelCenter = new JButton("Center");

        jFrame.add(labelNorth, BorderLayout.NORTH);
        jFrame.add(labelSouth, BorderLayout.SOUTH);
        jFrame.add(labelEast, BorderLayout.EAST);
        jFrame.add(labelWest, BorderLayout.WEST);
        jFrame.add(labelCenter, BorderLayout.CENTER);

        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Border();
    }
}
