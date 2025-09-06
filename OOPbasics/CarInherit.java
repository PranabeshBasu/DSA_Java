// Parent class
class Vehicle{
    private String NumberOfVehicle;

    public Vehicle(String NumberOfVehicle){
        this.NumberOfVehicle = NumberOfVehicle;
    }
    public void printVehicleNumber(){
        System.out.println(NumberOfVehicle);
    }
    public void honk(){
        System.out.println("HONKKKKK!!!!");
    }
}
// Child classes
class Car extends Vehicle{

    public Car(String NumberOfCar){
        super(NumberOfCar);
    }
    @Override
    public void honk(){
        System.out.println("Give me way"); //polymorphism
    }
}
class Bus extends Vehicle{

    public Bus(String NumberOfBus){
        super(NumberOfBus);
    }
}
public class CarInherit {
    public static void main(String[] args) {
        Car car = new Car("WB009JUK123Y");
        car.printVehicleNumber();
        car.honk();

        Bus bus = new Bus("WB900234YTHY");
        bus.printVehicleNumber();
        bus.honk();
    }
}
