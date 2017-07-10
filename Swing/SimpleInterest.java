import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterest extends JFrame implements ActionListener{
    JTextField principal, rate, time;
    JButton calculate;
    JLabel interest;

    SimpleInterest() {
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        principal = new JTextField(5);
        rate = new JTextField(5);
        time = new JTextField(5);
        calculate = new JButton("Calculate Interest");
        interest = new JLabel();

        gbc.gridx = 0;gbc.gridy = 0;
        add(new JLabel("Principal"), gbc);
        gbc.gridx = 1;
        add(principal, gbc);
        gbc.gridx = 0;gbc.gridy = 1;
        add(new JLabel("Rate"), gbc);
        gbc.gridx = 1;
        add(rate, gbc);
        gbc.gridx = 0;gbc.gridy = 2;
        add(new JLabel("Time"), gbc);
        gbc.gridx = 1;
        add(time, gbc);
        gbc.gridx = 0;gbc.gridy = 3;gbc.gridwidth = 2;
        add(calculate, gbc);
        gbc.gridy = 4;
        add(interest, gbc);

        calculate.addActionListener(this);
        setTitle("Simple Interest");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent actionEvent) {
        double p = Double.parseDouble(principal.getText());
        double t = Double.parseDouble(time.getText());
        double r = Double.parseDouble(rate.getText());
        double i = (p*t*r)/100;

        interest.setText(Double.toString(i));
    }

    public static void main(String[] args) {
        new SimpleInterest();
    }
}