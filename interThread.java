
class inter extends Thread{
    int sum=0;
    public void run(){
        synchronized (this) {
            
        
        for(int i=0;i<50;i++){
            sum=sum+i;
        }
        this.notify();
    }
}
}


public class interThread {
    public static void main(String[] args) throws InterruptedException{
        inter in = new inter();
        in.start();
        synchronized (in) {
            in.wait();
            System.out.println("sum "+in.sum);
        }
    }
}
