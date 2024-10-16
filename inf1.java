interface  inf11 {
  void m1();
}
interface inf2 extends inf11{
    void m2();
}
class c2 implements inf2{
    public void m1(){
        System.out.println("M1 Method");
    }
    public void m2(){
        System.out.println("M2 Method");
    }
}
class inf1 {
    public static void main(String[] args) {
    inf2 i;
    i = new c2();
    i.m1();
    i.m2();
    }
}
