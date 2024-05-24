// 8. Problem statement: Create a Java application to serialize and deserialize objects to/from a file using ObjectInputStream and ObjectOutputStream.

//    Test Case:
//    - Input: Object to serialize: Employee{name="John", age=30, department="IT"}

//    - Output: Serialized object saved to file "employee.ser"

//    - Input: Serialized object file "employee.ser"

//    - Output: Deserialized object: Employee{name="John", age=30, department="IT"}

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Task8{
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;


        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("employees.ser");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("Serialized object saved to file \"employees.ser\"");

            in.close();
            out.close();

            in = new FileInputStream("employees.ser");

            System.out.println("\nDeserialized Object: ");

            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}