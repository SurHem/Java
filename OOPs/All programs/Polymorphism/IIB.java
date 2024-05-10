class Student{
    private String name;
    private float marks;
    private double fees;
    private int grade;

    {//IIB
        name = null;
        marks = 0.0f;
        fees = 0.0;
        grade = 0;
        System.out.println("IIB Called!!");
    }

    Student(){System.out.println("Default constructor called!");}


    Student(String name , float marks , double fees , int grade){
        this.name = name;
        this.marks = marks;
        this.fees = fees;
        this.grade = grade;
        System.out.println("Paramenterized called!!");
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Fees: "+fees);
        System.out.println("Grade: "+grade);
    }
}

public class IIB {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s = new Student("Mohak",23,230000,1);
        s.display();
    }
}


