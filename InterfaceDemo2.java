interface Animal{
    public void sound();
    public void eat();
}
class Dog implements Animal
{
    public void sound(){
        System.out.println("Bow Bow");
    }
     public void eat(){
        System.out.println("Dog Can Eat Meat");
    }
    public void guard(){
        System.out.println("Dog Will Protect your House");
    }
}
class cow implements Animal
{
    public void sound(){
        System.out.println("Coe Makes Sound like Ambaa....");
    }
    public void eat(){
        System.out.println("Cow Eats Grass....");
    }
}
class tiger implements Animal
{
    public void sound(){
        System.out.println("Tiger is Roaring..");
    }
    public void eat(){
        System.out.println("Tiger Eats animals");
    }
    public void Attack(){
            System.out.println("Tiger Attacks Dangerly");
    }
}
public class InterfaceDemo2 {
    public static void main(String args[])
    {
        Animal a;
        a = new Dog();
        System.out.println("Currently Parent Reference variable a stores Dog instance");
        a.sound();
        a.eat();

        a = new cow();
        System.out.println("Currently parent Reference variable a stores Cow instance");
        a.sound();
        a.eat();

        a = new tiger();
        System.out.println("Currently parent Reference variable a Stores Tiger instsnce");
        a.sound();
        a.eat();
    }
}
