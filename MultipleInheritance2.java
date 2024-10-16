interface Flyable
{
    void fly();
}
interface swimmable
{
    void swim();
}
interface runnable
{
    void run();
}
class bird implements Flyable,runnable
{
    public void fly() 
    {
        System.out.println("Bird can fly");
    }
    public void run()
    {
        System.out.println("Bird can run");
    }
}
class Fish implements swimmable
{
    public void swim() {
        System.out.println("Fish can swim");
    }
}
class Dog implements swimmable,runnable
{
    public void swim()
    {
        System.out.println("Dog can swim");
    }
    public void run() 
    {
        System.out.println("Dog can run");
    }
}
public class MultipleInheritance2 {
    public static void main(String args[]){
        bird b=new bird();
        b.fly();
        b.run();

        Fish f=new Fish();
        f.swim();

        Dog d=new Dog();
        d.swim();
        d.run();
    }
}