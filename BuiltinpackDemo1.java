import java.util.*;
public class BuiltinpackDemo1 {
    public static void main(String[] args) {
        int n,x[];
        Scanner sc=new  Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
            x[i]=sc.nextInt();
        System.out.println("Before Sorting");
        for(int i=0; i<n; i++)
            System.out.println(x[i]);
        Arrays.sort(x);
        System.out.println("After Sorting");
        for(int i=0; i<n; i++)
            System.out.println("");

    }
}
