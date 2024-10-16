interface i1{
    void wish();
    void message();
}
interface i2{
    void wish();
    void show();
}
class Test implements i1,i2{
  public void show(){
    System.out.println("This is show method");
  }
  public void wish(){
    System.out.println("This is wish method");
  }
  public void message(){
    System.out.println("This is message method");
  }
}
public class multipleinheritance {
    public static void main(String args[]){
          Test t1 = new Test();
          t1.wish();
          t1.message();
          t1.show();
    }
}
