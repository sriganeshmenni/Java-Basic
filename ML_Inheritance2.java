class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class ML_Inheritance2 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   		// Output: Animal is eating
        puppy.bark();  		// Output: Dog is barking
        puppy.weep();  		// Output: Puppy is weeping
    }
}