import java.awt.*;
import javax.swing.*;

public class GridBag extends JFrame{
    GridBagConstraints gbc;
    GridBagLayout layout;

    public static void main(String[] args) {
        new GridBag();
    }

    public GridBag() {
        gbc = new GridBagConstraints();

        setTitle("GridBagLayout Example");
        layout = new GridBagLayout();
        setLayout(layout);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;gbc.gridy = 0;
        add(new Button("Button One"), gbc);
        gbc.gridx = 1;gbc.gridy = 0;
        add(new Button("Button two"), gbc);
        gbc.ipady = 20;
        gbc.gridx = 0;gbc.gridy = 1;
        gbc.gridwidth = 2;

        add(new Button("Button three"), gbc);
        setSize(300, 300);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}