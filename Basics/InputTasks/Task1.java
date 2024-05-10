// Write a Java program to take the user's name as input and display a personalized greeting message.

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;

        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.println("Welcome "+name);
    }

}