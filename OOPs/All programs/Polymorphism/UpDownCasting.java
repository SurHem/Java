class Vehicle{
    public void drive(){
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Car is being driven.");
    }

    public void park(){
        System.out.println("Car is parked.");
    }
}

class Truck extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Truck is being driven.");
    }

    public void loadCargo(){
        System.out.println("Truck is loading cargo.");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        // upcasting involves treating an object of a subclass as an object of a superclass. This is implicit and doesn't require explicit type casting.
        Vehicle vehicle = new Car();  //Upcasting
        vehicle.drive();

        Vehicle vehicle2 = new Truck();  //Upcating

        // Downcating involves explicitly converting an object of a super class to an object of a subclass.
        Truck truck = (Truck) vehicle2;  //Downcasting
        truck.drive();
        truck.loadCargo();



        //---------------------------------------------------------------
        // instanceof Operator (Boolean type)
        System.out.println(vehicle instanceof Car);//T
        System.out.println(vehicle instanceof Vehicle);//T
        System.out.println(vehicle2 instanceof Truck);//T
    }
}
