interface Test
{
    void print(String name);
}
public class FunctionalInterfaceDemo2 {
    public static void main(String[] args) {
        Test t = (name)->{System.out.println("Hello! "+name);};
        t.print("Aditya");
    }
}

