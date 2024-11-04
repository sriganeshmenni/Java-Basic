class MyThread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
           
           try {
            Thread.sleep(1000);
           } catch (InterruptedException e) {
                System.out.println(e);
           } 
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
               } catch (InterruptedException e) {
                    System.out.println(e);
               } 
        }
    }
}
class MyThread3 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
               } catch (InterruptedException e) {
                    System.out.println(e);
               } 
        }
    }
}
public class MutipleThreadsDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main Completed");
    }
}
