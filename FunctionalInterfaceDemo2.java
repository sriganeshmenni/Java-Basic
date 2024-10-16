interface Test1
{
    void print(String name);
}
public class FunctionalInterfaceDemo2 {
    public static void main(String[] args) {
        Test1 t = (name)->{System.out.println("Hello! "+name);};
        t.print("Aditya");
    }
}

