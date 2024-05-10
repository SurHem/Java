// Student Grades
// In a school grading system, create an array to store the grades of students in a class. Perform operations such as calculating the average grade, finding the highest and lowest grades, and identifying students who scored above a certain threshold.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter grade of student"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("1.Average");
        System.out.println("2.Highest");
        System.out.println("3.Lowest");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                float avg = 0.0f;
                for (int i = 0; i < arr.length; i++) {
                    avg += arr[i];
                }
                System.out.println("The Average is: "+avg/arr.length);
                break;
        
            case 2:
                int max = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                System.out.println("Highest is: "+max);
                break;

            case 3:
                int min = 101;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }

                System.out.println("Lowest is: "+min);
                break;

            default:
                break;
        }
    }
}

// 9 10 8 9 7