// Calculator
// In a calculator application, implement method overloading for the addition operation. Create multiple methods with different parameter types such as adding two integers, adding two doubles, and adding three integers.

class Calc{

    public static void add(int a , int b){
        System.out.println("Addition: "+(a+b));
    }

    public static void add(double a , double b){
        System.out.println("Addition: "+(a+b));
    }

    public static void add(int a , int b , int c){
        System.out.println("Addition of three number is: "+(a+b+c));
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calc.add(10, 10);
        Calc.add(10.23, 10.91);
        Calc.add(10, 10,11);
    }
}
