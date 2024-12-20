class exp1 extends Thread {
    int i=0;
    String th = Thread.currentThread().getName();
    public void run(){
        while(i<3){
            System.out.println(th);
            i++;
        }
    }
}
class exp2 extends Thread{
    String th2 = Thread.currentThread().getName();
    int i=0;
    public void run(){
        while(i<5){
            i++;
            System.out.println("thread 2");
        }
    }
}


public class ExtendThread {
    public static void main(String[] args) {
        exp1 t1 = new exp1();
        exp1 t2 = new exp1();

        t1.setName("thread 1");
        t2.setName("thread 2");


        t1.start();
       
        
    }
}
