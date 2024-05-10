// Employee Hierarchy
// Create an employee hierarchy with a base class called "Employee" and derived classes like "Manager," "Engineer," and "Intern." The base class can contain attributes like name and employee ID, while the derived classes can have additional attributes specific to their roles.

class Employee{
    String name;
    int id;

    Employee(String name , int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}


class Manager extends Employee{
    String role;

    Manager(String name , int id){
        super(name , id);
        this.role = "Manager";

    }

    void displayRole(){
        System.out.println(name+"'s role is: "+role);
    }
}

class Engineer extends Employee{
    String role;

    Engineer(String name , int id){
        super(name , id);
        this.role = "Engineer";

    }

    void displayRole(){
        System.out.println(name+"'s role is: "+role);
    }
}

class Intern extends Employee{
    String role;

    Intern(String name , int id){
        super(name , id);
        this.role = "Intern";

    }

    void displayRole(){
        System.out.println(name+"'s role is: "+role);
    }
}



public class Task2{
    public static void main(String[] args){
        Manager m = new Manager("Wish", 1);
        Engineer e = new Engineer("Vishwa", 2);
        Intern i = new Intern("Mohak", 3);


        m.display();
        m.displayRole();
        e.display();
        e.displayRole();
        i.display();
        i.displayRole();
    }
}