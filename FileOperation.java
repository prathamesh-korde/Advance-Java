
import java.io.*;
public class FileOperation {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\Advance java\\file.txt");
        if(f1.exists()){
            System.out.println("get name"+f1.getName());
            System.out.println("location "+f1.getAbsolutePath());
            System.out.println("can read "+f1.canRead());
            System.out.println("can write  "+f1.canWrite());
            System.out.println("size "+f1.length());
           // System.out.println("delete "+f1.delete());

        }
        else{
            System.out.println("file not exit");
        }
    }
}
