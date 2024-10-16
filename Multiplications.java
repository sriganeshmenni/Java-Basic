import java.util.Scanner;
public class Multiplications
{
    public static void print(int m,int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.println(m+" X "+i+" = "+m*i+"\n");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int m = sc.nextInt();
        n=sc.nextInt();
         Multiplications.print(m,n);
        sc.close();
    }
}