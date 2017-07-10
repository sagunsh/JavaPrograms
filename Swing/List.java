import javax.swing.*;

public class List {
    List(){
        JFrame f= new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("ADBMS");
        l1.addElement("IT");
        l1.addElement("JAVA");
        l1.addElement("DBA");
        JList<String> list = new JList<>(l1);
        list.setBounds(100,100, 75,75);
        f.add(list);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new List();
    }
}
