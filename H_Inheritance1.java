
class A {
    void display() {
        System.out.println("A's method");
    }
}

class B extends A {
    // B inherits A's method
}

class C extends A {
    // C inherits A's method
}

public class H_Inheritance1 {
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();
        objB.display();  // Output: A's method
        objC.display();  // Output: A's method
    }
}