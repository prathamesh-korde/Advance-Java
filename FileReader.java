
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileReader {
    public static void main(String[] args) throws IOException{
        FileOutputStream f1 = new FileOutputStream("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\Advance java\\file.txt");
        FileInputStream f2 = new FileInputStream("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\Advance java\\fbile.txt");
        int i;
        while((i=f2.read())!=-1){
            f1.write((char)i);
        }
        f2.close();
    }
}