import java.io.FileOutputStream;  
public class FileOutputStreamn{  
    public static void main(String args[]){  
      try {
          FileOutputStream f1 = new FileOutputStream("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\Advance java\\fbile.txt");
          String str="PRATHAMESH KORDE";
          byte b[] = str.getBytes();
          f1.write(b);
          f1.close();
      } catch (Exception e) {
      }
    }
}  