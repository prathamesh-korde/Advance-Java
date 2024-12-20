import java.util.*;
class abc extends RuntimeException{
    public  String toString(){
        return "to string";
    }
    public void Message(){
        System.out.println("get message");
    }
}

public class CustomException{
    public static void main(String[] args) throws abc{
        Scanner sc = new Scanner(System.in);
    int age=sc.nextInt();
        if(age<18){ 
            throw new abc();
        }
}
    }

