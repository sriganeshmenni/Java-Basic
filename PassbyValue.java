class Test{
    public void incrementByTwo(int x){
        x += 2;
    }
}
public class PassbyValue {
    public static void main(String[] args) {
        Test t1 = new Test();
        int n=10;
        System.out.println("Before calling the incrementByTwo: n="+n);
        t1.incrementByTwo(n);
        System.out.println("After calling the incrementByTwo: n="+n);

    }
}
