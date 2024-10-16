import java.util.Scanner;
class ArthematicOperations
{
    public static void main(String args[])
    {
        int a,b;
        System.out.println("Enter values of a and b");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a :");
        a=sc.nextInt();
        System.out.print("Enter b :");
        b=sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        System.out.println("Sum = "+sum);
        System.out.println("Multiplication = "+mul);
        System.out.println("Divison = "+div);
        System.out.println("Difference = "+sub);
         sc.close();
    }
}