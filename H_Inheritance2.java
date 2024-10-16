class Vehicle {
    void start() {
      System.out.println("Vehicle is starting");
  }
}

class Car extends Vehicle {
  void drive() {
      System.out.println("Car is driving");
  }
}

class Bike extends Vehicle {
    void ride() {
      System.out.println("Bike is riding");
  }
}

public class H_Inheritance2 {
  public static void main(String[] args) {
      Car car = new Car();
      Bike bike = new Bike();

      car.start();  // Output: Vehicle is starting
      car.drive();  // Output: Car is driving

      bike.start(); // Output: Vehicle is starting
      bike.ride();  // Output: Bike is riding
  }
}