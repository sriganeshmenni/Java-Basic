interface Test{
    void print();
}
class Sample implements Test{
    public void print(){
        System.out.println("Hello! Ganesh");
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Test t = new Sample();
        t.print();
    }
}
