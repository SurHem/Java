// Shape Drawing Application
// In a shape drawing application, create a base class called "Shape" with a method called "draw." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "draw" method to display the respective shapes.


class Shape{
    String shape;


    void draw(){
        System.out.println("Drawing");
    }
}


class Circle extends Shape{
    
    Circle(){
        super.shape = this.getClass().getName();
    }

    @Override
    void draw(){
        System.out.println("Drawing "+shape);
    }
}

class Rectangle extends Shape{

    Rectangle(){
        super.shape = this.getClass().getName();
    }


    @Override
    void draw(){
        System.out.println("Drawing "+shape);
    }
}


public class ShapeDraw {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.draw();
        r.draw();
    }
}