import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Slider extends JFrame{
    private JPanel panel;
    private JSlider slider;
    private JLabel value;

    public Slider() {
        initUI();
    }

    public void initUI() {
        panel = new JPanel();

        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        value = new JLabel();
        value.setText("Value = " + slider.getValue());

        panel.add(slider, BorderLayout.CENTER);
        panel.add(value);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                value.setText("Value = " + slider.getValue());
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        Slider s = new Slider();
        s.setSize(500,300);
        s.setVisible(true);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}