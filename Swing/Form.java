import javax.swing.*;
import java.awt.*;

public class Form extends JFrame{
    JLabel firstNameLabel, lastNameLabel, passwordLabel,
            emailLabel, genderLabel, languageLabel;
    JTextField firstName, lastName, email;
    JPasswordField password;
    JRadioButton maleBtn, femaleBtn;
    JCheckBox cpp, java, python;

    Form() {
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        firstName = new JTextField(20);
        lastName = new JTextField(20);
        email = new JTextField(20);
        password = new JPasswordField(20);
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female", true);
        cpp = new JCheckBox("C++");
        java = new JCheckBox("Java");
        python = new JCheckBox("Python", true);

        firstNameLabel = new JLabel("First Name");
        lastNameLabel = new JLabel("Last Name");
        emailLabel = new JLabel("Email Address");
        passwordLabel = new JLabel("Password");
        genderLabel = new JLabel("Gender");
        languageLabel = new JLabel("Programming Language");

        gbc.gridx = 0; gbc.gridy = 0;
        add(firstNameLabel, gbc);
        gbc.gridx = 2; gbc.gridy = 0;
        add(firstName, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(lastNameLabel, gbc);
        gbc.gridx = 2; gbc.gridy = 1;
        add(lastName, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(emailLabel, gbc);
        gbc.gridx = 2; gbc.gridy = 2;
        add(email, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        add(passwordLabel, gbc);
        gbc.gridx = 2; gbc.gridy = 3;
        add(password, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        add(genderLabel, gbc);
        gbc.gridx = 2; gbc.gridy = 4;
        add(maleBtn, gbc);
        gbc.gridx = 4; gbc.gridy = 4;
        add(femaleBtn, gbc);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleBtn);buttonGroup.add(femaleBtn);

        gbc.gridwidth = 20;
        gbc.gridx = 0; gbc.gridy = 5;
        add(languageLabel, gbc);
        gbc.gridx = 0; gbc.gridy = 6;
        add(cpp, gbc);
        gbc.gridx = 0; gbc.gridy = 7;
        add(java, gbc);
        gbc.gridx = 0; gbc.gridy = 8;
        add(python, gbc);

        setTitle("Simple Form");
        setVisible(true);
        setSize(500,500);

        /*
            To do list
            - Add button
            - Add listener to button
         */
    }

    public static void main(String[] args) {
        new Form();
    }
}
