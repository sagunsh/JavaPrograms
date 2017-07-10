import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddNumber extends JFrame implements ActionListener{
    private JButton addBtn;
    private JTextField num1;
    private JTextField num2;
    private JLabel plusSign;
    private JLabel equalSign;
    private JLabel result;

    AddNumber()
    {
        initUI();
    }

    public void initUI()
    {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(layout);

        addBtn = new JButton("ADD");
        num1 = new JTextField(5);
        num2 = new JTextField(5);
        result = new JLabel();
        plusSign = new JLabel(" + ");

        gbc.gridx = 0;gbc.gridy = 0;
        add(num1, gbc);
        gbc.gridx = 1;
        add(plusSign, gbc);
        gbc.gridx = 2;
        add(num2, gbc);
        gbc.gridx = 0;gbc.gridy = 2;
        gbc.gridwidth = 4;
        add(addBtn, gbc);
        gbc.gridx = 0;gbc.gridy = 4;
        add(result, gbc);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        int x = Integer.parseInt(num1.getText());
        int y = Integer.parseInt(num2.getText());
        result.setText("Sum = " + Integer.toString(x+y));
    }

    public static void main(String [] args) {
        new AddNumber();
    }
}