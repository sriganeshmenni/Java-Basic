import java.util.Scanner;
public class OperationsonNumbers 
{
    public static int findDigits(int n)
    {
        int digitcount = (int)Math.log10(n)+1;
        return digitcount;
    }
    public static int SumofDigits(int n)
    {
        int sum = 0;
        while (n!=0) {
            sum += n%10;
            n /=10;
        }
        return sum;
    }
    public static int productofDigits(int n)
    {
        int product = 1;
        while (n!=0) {
            product *= n%10;
            n /=10;
        }
        return product;
    }
    public static int EvenDigitsSum(int n)
    {
        int r,sum = 0;
        while (n!=0) {
            r = n%10;
            if(r%2==0){
            sum += r;
            }
            n /=10;
        }
        return sum;
    }
    public static int OddDigitsSum(int n)
    {
        int r,sum = 0;
        while (n!=0) {
            r = n%10;
            if(r%2!=0){
            sum += r;
            }
            n /=10;
        }
        return sum;
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("1. FindDigits\n2. Sum of Digits \n3. Product of Digits\n4. EvenDigitSum\n5. OddDigitsSum\n");
      System.out.print("Enter Option :");
       int opt = sc.nextInt();
       switch (opt) {
        case 1:
               int n = sc.nextInt();
               int digitscnt = OperationsonNumbers.findDigits(n);
               System.out.println(digitscnt);
               break;
        case 2:   
                int m = sc.nextInt();
                int sum = OperationsonNumbers.SumofDigits(m) ;
                System.out.println("sum"+" = "+sum);
                break;
        case 3:
                int o = sc.nextInt();
                int product = OperationsonNumbers.productofDigits(o) ;
                System.out.println("product"+" = "+product);
                break;
        case 4:
                int num = sc.nextInt();
                int EvenSum = OperationsonNumbers.EvenDigitsSum(num);
                System.out.println("EvenDigitsSum"+" = "+EvenSum);
                break;
        case 5:
                int a = sc.nextInt();
                int OddSum = OperationsonNumbers.OddDigitsSum(a);
                System.out.println("OddDigitsSum"+" = "+OddSum);
                break;
        default:
               System.out.println("Invalid Option");
            break;
       }
       sc.close();
    }
}
