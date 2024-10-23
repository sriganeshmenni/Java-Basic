import java.util.Scanner;
public class ExceptionDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        int z = x/y;
        System.out.println("Result = "+z);
        sc.close();
        /***Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo.main(ExceptionDemo.java:9) */
    }
}