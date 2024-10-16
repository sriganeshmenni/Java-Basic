import java.util.Scanner;
class SimpleInterest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p,t,r;
        float si;
        System.out.println("Enter:");
        System.out.print("Enter Principal Amount = ");
        p=sc.nextInt();
        System.out.print("Enter Rate of Interest = ");
        r=sc.nextInt();
        System.out.print("Enter Time = ");
        t=sc.nextInt();
        si = (p*t*r)/100;
        System.out.printf("Simple Interst = %.2f",si);
        sc.close();
    }
}