class A{
    static int x;
    static int z = 10;
    public A(int x){
        this.x=x;
    }
    static class B{
        int y;
        public B(int y){
            this.y=y;
        }
        public void Displayinfo()
        {
            System.out.println("Y = "+y);
            System.out.println("x = "+x);
            System.out.println("z = "+z);
        }
    }
}
public class staticclass {
    public static void main(String args[])
    {
        A.B b = new A.B(20);
        b.Displayinfo();
    }
}
