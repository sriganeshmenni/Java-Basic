
class Vehicle {
    void start() {
       System.out.println("Vehicle is starting");
   }
   void stop(){
    System.out.println("Vehicle get Stopped ");
   }
}

class Car extends Vehicle {
    void drive() {
       System.out.println("Car is driving");
   }
}
class ElectricCar extends Car {
    void charge(){
      System.out.println("Electric Car is Charging");
   }

}


public class ML_Inheritance3 {
   public static void main(String[] args) {
    ElectricCar Car = new ElectricCar();
    Car.charge();
    Car.start();
    Car.drive();
    Car.stop();
   }
}
