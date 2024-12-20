import java.util.*;
class myexp extends RuntimeException{
   public String toStrinr(){
    return "toS";
   }
}

public class ThrowExampl {
   
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>18){
        try {
            throw new myexp();
            //throw new ArithmeticException("this is exception");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    }
}
