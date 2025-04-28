class Vehicle{
    String name, brand, color;
    public Vehicle(String name, String brand, String color){
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public Vehicle(){

    }

    public void printDetails(){
        System.out.println(name + " " + brand + " " + color);
    }

    public void startVehicle(){
        System.out.println("Vehicle is starting....");
    }
}

class Car extends Vehicle{
    public Car(String name, String brand, String color) {
        super(name, brand, color);
    }
    public void startVehicle(){
        System.out.println("Car is starting....");
    }
}

public class InheritanceTest {
    public static void main(String[] args){
        Car car = new Car("CHR", "Toyota", "Red");
        car.printDetails();
        car.startVehicle();
    }
}
