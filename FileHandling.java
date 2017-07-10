import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException{
        /* Copy File using Character stream classes */
        FileReader fin = new FileReader("test.txt");
        FileWriter fout = new FileWriter("new.txt");
        int ch;
        while ((ch=fin.read())!=-1)
            fout.write(ch);

        System.out.println("File copied successfully");
        fin.close();
        fout.close();

        /* Copy File using Byte stream classes */
        FileInputStream in = new FileInputStream("new.txt");;
        FileOutputStream out = new FileOutputStream("out.txt");

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.close();
    }
}