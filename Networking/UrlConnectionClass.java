import java.io.*;
import java.net.*;

public class UrlConnectionClass {
    public static void main(String[] args) throws Exception{
        URL url=new URL("https://sagunsh.github.io/");
        URLConnection urlconn = url.openConnection();
        InputStream inputStream = urlconn.getInputStream();
        int c;
        while((c=inputStream.read())!=-1){
            System.out.print((char)c);
        }
    }
}  