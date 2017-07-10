import javax.swing.*;

public class Table {
    JFrame frame;

    Table() {
        frame = new JFrame();
        String data[][] = {
                {"Queen","Hard"},
                {"Pearl Jam", "Grunge"},
                {"Radiohead", "Alternative"}
        };
        String column[] = {"Band", "Genre"};

        JTable table = new JTable(data,column);
        table.setBounds(30,40,200,300);
        JScrollPane scrollPane=new JScrollPane(table);

        frame.add(scrollPane);
        frame.setSize(300,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Table();
    }
}