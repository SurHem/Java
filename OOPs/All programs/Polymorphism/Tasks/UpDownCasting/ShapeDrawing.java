// In a shape drawing application, define a base class called "Shape" with a method called "draw" that displays the shape on the screen. Implement derived classes like "Circle" and "Rectangle" that override the "draw" method with their specific drawing logic.


class Shape{
    public void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
}


class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class ShapeDrawing {
    public static void main(String[] args){
        
    }   
}
