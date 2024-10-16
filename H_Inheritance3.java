class Animal {
    void eat() {
        System.out.println("=============================================");
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks like Booo Booo");
    }
    void bark(){
        System.out.println("Dog is barking");
        System.out.println("=============================================");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat sounds like meow meow");
    }
    void Catch() {
        System.out.println("Cat is catching Rats");
        System.out.println("=============================================");
    }
}

public class  H_Inheritance3 {
    public static void main(String[] args) {
        System.out.println("********************DOG**********************");
        Dog dog = new Dog();
        dog.eat();
        dog.sound();  	
        dog.bark();	
        System.out.println("********************CAT**********************");

        Cat cat = new Cat()	;
        cat.eat();
        cat.sound();
        cat.Catch();
    }
}