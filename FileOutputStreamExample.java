import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\\\Users\\\\Prathmesh\\\\OneDrive\\\\Desktop\\\\Advance java\\\\file.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }
            catch(Exception e){
                  System.out.println(e);
            }
      }    
}  