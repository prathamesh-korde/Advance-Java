import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\Advance java\\file.txt");
        if(f1.createNewFile()){
            System.out.println("new file is created");
        }
        else{
            System.out.println("file alradey exit");
        }
    }
}
