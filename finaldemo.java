class A{
    public void Display(){
        System.out.println("Hi");
    }
}
class B extends A{
    public  void Display(){
        System.out.println("Hi");
    }
}
public class finaldemo {
    public static void  main(String args[]){
        System.out.println("Sri");
        A b = new A();
        b.Display();
    }
}
