// In a vehicle rental system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

class Vehicle{
    public void rent(){
        System.out.println("Renting Vehicle");
    }
}

class Car extends Vehicle{
    @Override
    public void rent(){
        System.out.println("Renting Car");
    }
}

class Motorcycle extends Vehicle{
    @Override
    public void rent(){
        System.out.println("Renting Motorcycle");
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.rent();

        Vehicle vehicle2 = new Motorcycle();
        vehicle2.rent();

        // downcasting

        Car car = (Car) vehicle;
        Motorcycle motorcycle = (Motorcycle) vehicle2;

        vehicle.rent();
        vehicle2.rent();
    }
}
