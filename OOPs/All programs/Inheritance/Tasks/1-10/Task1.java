// /Vehicle Hierarchy
// /Consider a vehicle hierarchy where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Define common attributes and behaviors in the base class and specific attributes and behaviors in the derived classes.

class Vehicle{
    String model;
    int year;


    Vehicle(String model , int year){
        this.model = model;
        this.year = year;
    }

    protected void startEngine(){
        System.out.println("Starting the Engine of "+model);
    }

    protected void stopEngine(){
        System.out.println("Stopping the Engine of "+model);
    }
}

class Car extends Vehicle{
    int horsePower;

    Car(String model , int year , int horsePower){
        super(model, year);
        this.horsePower = horsePower;
    }

    void getHorsePower(){
        System.out.println("HorsePower of "+model+" is: "+horsePower);
    }
}


class Motorcycle extends Vehicle{
    int cc;

    Motorcycle(String model , int year , int cc){
        super(model, year);
        this.cc = cc;
    }

    void getCC(){
        System.out.println("The CC of "+model+" is: "+cc);
    }
}

class Truck extends Vehicle{
    int tourque;

    Truck(String model , int year , int tourque){
        super(model, year);
        this.tourque = tourque;
    }

    void getTourque(){
        System.out.println("The Tourque of "+model+" is: "+tourque);
    }
}

class Task1 {
    public static void main(String[] args) {
        Car c1 = new Car("M8 Comp", 2018, 650);
        Motorcycle m1 = new Motorcycle("Ninja h2", 2022, 1200);
        Truck t1 = new Truck("BharatBenz", 2017, 1700);


        c1.getHorsePower();
        c1.startEngine();
        c1.stopEngine();

        m1.getCC();
        m1.startEngine();
        m1.stopEngine();

        t1.getTourque();
        t1.startEngine();
        t1.stopEngine();


    }
}