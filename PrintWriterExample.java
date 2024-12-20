
import java.io.File;  
import java.io.PrintWriter;  
public class PrintWriterExample {  
    public static void main(String[] args) throws Exception {  
//Data to write in File using PrintWriter       
      PrintWriter writer1 =null;      
         writer1 = new PrintWriter(new File("C:\\\\Users\\\\Prathmesh\\\\OneDrive\\\\Desktop\\\\Advance java\\\\file.txt"));  
         writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
                         writer1.flush();  
         writer1.close();  
    }  
}  

