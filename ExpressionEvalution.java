import java.util.Scanner;
public class ExpressionEvalution 
{
    public static double Calculate(int x,int n)
    {
         double sum =1;
        for(int i= 1;i<n;i++){
           sum = sum +((Math.pow(-1,i))/Math.pow(x,i));
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        
       int  x = sc.nextInt();
        n = sc.nextInt();

        Double Expression = ExpressionEvalution.Calculate(x,n);
        System.out.println(Expression);
        sc.close();
    }
}
