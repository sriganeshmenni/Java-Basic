class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            //System.out.println("Ganesh Thread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
           // System.out.println("Sita Thread ");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class FirstThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        t1.setName("Sri");
        t2.setName("Menni");
        Thread.currentThread().setName("Ganesh");
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
