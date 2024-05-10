// In an employee database system, create a class called "Employee" with an instance initializer block that initializes a static database connection. The block runs whenever an object of the "Employee" class is created.


class Employee{
    boolean status = false;

    {
        System.out.println("Static database connection started");
        status = true;
    }

    void displayStatus(){
        System.out.println("Sever Status: "+status);
    }
}

public class EmployeeDatabase {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayStatus();
    }
}
