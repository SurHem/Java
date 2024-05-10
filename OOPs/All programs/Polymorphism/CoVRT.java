class Vehicle{
    Vehicle startEngine(){
        System.out.println("Starting the engine of a generic vehicle.");
        return this;
    }
}

class Car extends Vehicle{
    @Override
    Car startEngine(){
        System.out.println("Starting the engine of a car.");
        return this;
    }
}   

class Shape{
    Shape createShape(){
        System.out.println("Creating generic Shape.");
        return this;
    }
}

class Circle extends Shape{
    @Override
    Circle createShape(){
        System.out.println("Creating circle Shape.");
        return this;
    }
}

class Rectangle extends Shape{
    @Override
    Rectangle createShape(){
        System.out.println("Creating rectangle Shape.");
        return this;
    }
}

public class CoVRT{
    public static void main(String[] args){
        // Vehicle v = new Vehicle();
        // v.startEngine();

        // Car c = new Car();
        // c.startEngine();

        // Vehicle v = new Car();
        // v.startEngine();
    
        Shape s;

        s = new Shape();
        s.createShape();

        s = new Circle();
        s.createShape();

        s = new Rectangle();
        s.createShape();
    }
}