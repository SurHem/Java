import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable{
    private String name;
    private int age;
    private String department;

    public Employee(String name , int age , String department){
        this.name = name;
        this.age = age;
        this.department = department; 
    }

    @Override

    public String toString(){
        return "Employee{ Name: '" + name + "', age = " + age + ", Department: '" + department + "' }";
    }
}


public class Task8{


    public static void main(String[] args){
        Employee emp = new Employee("Jhon", 15, "Sales");

        serializeObject(emp, "employee.ser");

        Employee deserializedEmp = deserializeObject("employee.ser");
        
        System.out.println(deserializedEmp);
    
    }




    
    public static void serializeObject(Employee emp , String fileName){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(emp);
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Employee deserializeObject(String fileName){
        Employee emp = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            emp = (Employee) ois.readObject();
            System.out.println("Object deserialized successfully!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return emp;
    }
}