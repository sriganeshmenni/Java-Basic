interface I1{
    void m1();
    void m2();
    void m3();
}
class c1 implements I1{
    public void m1(){
        System.out.println("M1 Method");
    }
    public void m2(){
        System.out.println("M2 Method");
    }
    public void m3(){
        System.out.println("M3 Method");
    }
}
public class interfaceDdemo {
    public static void main(String args[]){
        I1 i = new c1();
        i.m1();
        i.m2();
        i.m3();
    }
}
