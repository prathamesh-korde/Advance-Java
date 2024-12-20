class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
    }
}

public class Shedular {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

      t1.setPriority(8);
      t2.setPriority(6);
      t3.setPriority(4);
        t1.start();
        t2.start();
        t3.start();
    }
}
