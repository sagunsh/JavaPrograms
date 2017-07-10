import javax.swing.*;

public class ProgressBar extends JFrame{
    JProgressBar bar;
    JLabel label;

    ProgressBar() {
        bar = new JProgressBar(0,1000);
        bar.setBounds(40,40,160,30);
        bar.setValue(0);
        bar.setStringPainted(true);
        label = new JLabel("Running");
        label.setBounds(80,60,100,50);
        add(bar);
        add(label);

        setSize(250,200);
        setLayout(null);
        setVisible(true);
    }

    public void iterate() {
        int i = 0;
        while (i<=1000) {
            bar.setValue(i);
            i += 1;
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (bar.getValue()==1000)
                label.setText("Completed");
        }
    }

    public static void main(String[] args) {
        ProgressBar progress = new ProgressBar();
        progress.iterate();
    }
}