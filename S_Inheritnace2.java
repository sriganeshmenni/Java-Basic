class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
    void guard(){
        System.out.println("Dog is protecting the House");
    }
}
class Tiger extends Animal{
    void hunt(){
        System.out.println("Tiger is Hunting");
    }
    
    void Roar(){
        System.out.println("Tiger is Roaring");
    }
}

public class S_Inheritnace2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  	// Output: Animal is eating
        dog.bark(); 
        dog.guard();
        dog.sleep();	// Output: Dog is barking;
        Tiger tiger = new Tiger();
        tiger.hunt();
        tiger.Roar();
    }
}
