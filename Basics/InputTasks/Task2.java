// Create a program that prompts the user to enter their age, and then determine if they are eligible for voting (age >= 18).

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are Eligible");
        }else{
            System.out.println("you are not Eligible");
        }
    }
    
}