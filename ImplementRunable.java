class Thread1 implements Runnable{
    
    public void run(){
        
       String th = Thread.currentThread().getName();
        int i =0;
        try{
        while(i<5){
            i++;
            Thread.sleep(1000);
            System.out.println(th);
        }
    }
    catch(InterruptedException e){

    }
    }
}
class Thread2 implements Runnable{
    
    public void run(){
        int i =0;
        String nm = Thread.currentThread().getName();
        while(i<5){
            i++;
            System.out.println(nm);
        }
    }
}

public class ImplementRunable {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread1 t3 = new Thread1();
        Thread2 t4 = new Thread2();


        Thread g1 = new Thread(t1);
        Thread g2 = new Thread(t2);
        Thread g3 = new Thread(t3);
        Thread g4 = new Thread(t4);

        g1.setName("thread 1");
        g2.setName("thread 2");
        
        
   
        g1.start();
        g4.start();
        g2.start();


    }
}
