// Build a Java application to collect the user's contact information (name, email, and phone number) and display it back to them.

import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name , email;
        double phNo;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your Email: ");
        email = sc.nextLine();

        System.out.print("Enter your Phone Number: ");
        phNo = sc.nextDouble();

        System.out.println("Name: "+name+"\nEmail: "+email+"\nPhone Number: "+phNo);
    }
}