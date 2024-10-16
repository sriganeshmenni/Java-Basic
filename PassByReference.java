class Test{
    public void incrementByTwo(int x[]){
        for(int i=0;i<x.length;i++){
            x[i] = x[i]+2;
        }
    }
}
public class PassByReference {
    public static void main(String[] args) {
        Test t1 = new Test();
        int n[]={1,2,3,4,5};
        System.out.print("Before calling the incrementByTwo: ");
        for(int ele:n)
           System.out.print(ele+" ");
        System.out.print('\n');
        t1.incrementByTwo(n);
        System.out.print("After calling the incrementByTwo: ");
        for(int ele:n)
           System.out.print(ele+" ");
    }
}
