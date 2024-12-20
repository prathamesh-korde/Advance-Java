
import java.io.BufferedWriter;
import java.io.FileWriter;



public class WriteFile {
    public static void main(String[] args){
          try{
            FileWriter f1 = new FileWriter("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\Advance java\\file.txt");
            BufferedWriter buff = new BufferedWriter(f1);
            try{
                buff.write("java is best....");
            }
            finally{  
                buff.close();
            }
            System.out.println("file writed succesfully");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
