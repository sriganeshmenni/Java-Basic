import java.util.Scanner;
public class ArrayDemo {
    public static int CalculateSum(int A[]){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum += A[i];
        }
        return sum;
    }
    public static int CalculateDiff(int A[]){
        int Diff=0;
        for(int i=0;i<A.length;i++){
            Diff -= A[i];
        }
        return Diff;
    }
    public static int CalculateEvenOddDiff(int A[]){
        int Evensum=0,Oddsum=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0)
            Evensum += A[i];
        }
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0)
            Oddsum += A[i];
        }
        int EvenoddDiff = Evensum-Oddsum;

        return EvenoddDiff;
    }
    public static int CalculateProduct(int A[]){
        int pro=1;
        for(int i=0;i<A.length;i++){
            pro *= A[i];
        }
        return pro;
    }
    public static int FindMin(int A[]){
        int min=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]<min)
             min = A[i];
        }
        return min;
    }
    public static int FindMax(int A[]){
        int max=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max)
             max = A[i];
        }
        return max;
    }

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n,A[];
       n = sc.nextInt();
       A = new int[n];
       for(int i=0;i<n;i++){
        A[i]=sc.nextInt();
       }
       int SumArray  = ArrayDemo.CalculateSum(A);
       System.out.println("Sum Of Array = "+SumArray);
       int DiffArray  = ArrayDemo.CalculateDiff(A);
       System.out.println("Diff Of Array = "+DiffArray);
       int EvenOddDiff  = ArrayDemo.CalculateEvenOddDiff(A);
       System.out.println("EvenOddDiff = "+EvenOddDiff);
       int pro = ArrayDemo.CalculateProduct(A);
       System.out.println("Product of array = "+pro);
       int Findmin = ArrayDemo.FindMin(A);
       System.out.println("Minimum Element = "+Findmin);
       int Findmax = ArrayDemo.FindMax(A);
       System.out.println("Maximum Element = "+Findmax);
       System.out.println( "Element = "+Findmax);
       sc.close();
       

    }
}
