class A {
    void display() {
        System.out.println("A's method");
    }
}

class B extends A {
    void show()
	{
	  System.out.println("B's method");
	}
}
class C extends B
{
   void wish()
   {
      System.out.println("C's method");
   }
}

public class ML_Inheritance1 {
    public static void main(String[] args) {
        C obj=new C();
        obj.display();  // Output: A's method
		obj.show();		// Output: B's method
		obj.wish();		// Output: C's method
    }
}