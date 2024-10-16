class Animal {
    public void eat() {
        System.out.println("=============================================");

        System.out.println("Animal is Eating");
    }
    public void sound() {
        System.out.println("=============================================");

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
     public void sound() {
        System.out.println("=============================================");

        System.out.println("Dog barks like BOW BOW...");
    }
    public void guard(){
        System.out.println("=============================================");

        System.out.println("Dog is Securing House");
    }
}

public class Method_Overriding1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); 			// Output: Animal makes a sound

        Dog myDog = new Dog();
        myDog.sound();    			// Output: Dog barks
        myDog.eat();
        myDog.guard();
        System.out.println("=============================================");
    }
}