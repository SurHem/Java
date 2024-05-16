// Problem Statement: Student Management System
// Design and implement a simple Student Management System (SMS) in Java using Object-Oriented Programming (OOP) principles. The system should be able to perform basic CRUD (Create, Read, Update, Delete) operations on student records. Each student record will consist of the following attributes:

// Student ID (String)
// Name (String)
// Age (int)
// Major (String)
// The system should provide the following functionalities:

// > Create a new student record: Add a new student to the system.
// > Read student records:
// > Display a list of all students.
// > Display details of a student by Student ID.
// > Update an existing student record: Modify the details of an existing student.
// > Delete a student record: Remove a student from the system by Student ID.

// Requirements:
// 	1. Use basic arrays to store the student records.
// 	2. Implement string methods and array manipulations to perform CRUD operations.
// 	3. Apply encapsulation to manage student data.


import java.util.Scanner;

class Student {
    int Id;
    String name;
    int age;
    String major;

    Student(int Id, String name, int age, String major) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.major = major;
    }
}

class Students {
    int count;
    Student students[];

    Students() {
        count = 0;
        students = new Student[10];
    }

    public void createStudent() {
        if (count >= 10) {
            System.out.println("Maximum number of Students reached!!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        int age;
        String major;
        System.out.println("\nCreating new Student, enter the details: ");
        System.out.print("Enter the Id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name: ");
        name = sc.nextLine();
        System.out.print("Enter the Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Major: ");
        major = sc.nextLine();
        students[count] = new Student(id, name, age, major);
        System.out.println("Created new student!!");
        count++;
    }

    public void displayAllStudents() {
        if (count == 0) {
            System.out.println("No Students to Display!!!");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("\nStudent " + (i + 1) + " details:");
                System.out.println("Id: " + students[i].Id);
                System.out.println("Name: " + students[i].name);
                System.out.println("Age: " + students[i].age);
                System.out.println("Major: " + students[i].major);
            }
        }
    }

    public void displayStudentById() {
        Scanner sc = new Scanner(System.in);
        if (count == 0) {
            System.out.println("No Students to Display!!!");
        } else {
            int id;
            boolean flag = false;
            System.out.println("Enter the id of student you want to display: ");
            id = sc.nextInt();
            for (int i = 0; i < count; i++) {
                if (students[i].Id == id) {
                    System.out.println("Found the Student: ");
                    System.out.println("Id: " + students[i].Id);
                    System.out.println("Name: " + students[i].name);
                    System.out.println("Age: " + students[i].age);
                    System.out.println("Major: " + students[i].major);
                    System.out.println("\n\n");
                    flag = true;
                    break;
                }
            }
            if (flag != true) {
                System.out.println("Student with Id: " + id + " Not Found!!!");
            }
        }
    }

    public void modifyDetails() {
        Scanner sc = new Scanner(System.in);
        if (count == 0) {
            System.out.println("No Students to Display!!!");
        } else {
            int id;
            boolean flag = false;
            System.out.println("Enter the id of Student you want to modify: ");
            id = sc.nextInt();
            for (int i = 0; i < count; i++) {
                if (students[i].Id == id) {
                    flag = true;
                    int choice;
                    boolean loop = true;
                    while (loop) {
                        System.out.println("1. Update Name");
                        System.out.println("2. Update Age");
                        System.out.println("3. Update Major");
                        System.out.println("4. Update Id");
                        System.out.println("0. Exit");
                        System.out.print("Enter your choice: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Enter new name: ");
                                students[i].name = sc.next();
                                System.out.println("Update the name successfully!");
                                break;

                            case 2:
                                System.out.println("Enter new Age: ");
                                students[i].age = sc.nextInt();
                                System.out.println("Updated the age successfully!");
                                break;

                            case 3:
                                System.out.println("Enter new major: ");
                                students[i].major = sc.next();
                                System.out.println("Updated the major successfully!");
                                break;

                            case 4:
                                System.out.println("Enter new id: ");
                                students[i].Id = sc.nextInt();
                                System.out.println("Updated the Id successfully!");
                                break;

                            case 0:
                                loop = false;
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                    }
                    break;
                }
            }
            if (flag != true) {
                System.out.println("Student with Id: " + id + " Not Found!!!");
            }
        }
    }

    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        if (count == 0) {
            System.out.println("There is no Student in the record to delete!!!");
        } else {
            int id;
            boolean flag = false;
            System.out.print("Enter the id of Student you want to delete: ");
            id = sc.nextInt();
            for (int i = 0; i < count; i++) {
                if (students[i].Id == id) {
                    for (int j = i; j < count - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    System.out.println("Deleted the Student!!");
                    count--;
                    flag = true;
                    break;
                }
            }

            if (flag != true) {
                System.out.println("Student not found!!");
            }
        }
    }
}

public class SMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Students s = new Students();

        while (true) {
            System.out.println("\n1. create new Student");
            System.out.println("2. delete student");
            System.out.println("3. Display All Students");
            System.out.println("4. Display a Student by id");
            System.out.println("0. exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.createStudent();
                    break;

                case 2:
                    s.deleteStudent();
                    break;

                case 3:
                    s.displayAllStudents();
                    break;

                case 4:
                    s.displayStudentById();
                    break;

                case 0:
                    System.out.println("Exiting the program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}