public class MainThreadDemo{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setName("Ganesh");
        System.out.println(Thread.currentThread().getName());
    }
}