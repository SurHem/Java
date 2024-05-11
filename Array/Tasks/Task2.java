// In a retail business, create an array to store the daily sales data for different products. Perform operations such as calculating the total sales, finding the best-selling product, and generating a sales report for a specific period.

import java.util.Scanner;

public class Task2 {

    static void totalSales(int arr[][]){
        int grandTotal = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                grandTotal += arr[i][j];
            }
        }

        System.out.println("Total Sales of all products: "+grandTotal);
    }

    static void bestSellingProduct(int arr[][]){
        int bestProduct = 0;
        int productTotal = 0;
        int total;


        for (int i = 0; i < arr.length; i++) {
            total = 0;
            for (int j = 0; j < arr.length; j++) {
                total += arr[i][j];
            }
            if (total > productTotal) {
                productTotal = total;
                bestProduct = i+1;
            }
        }

        System.out.println("Best Selling product is: "+bestProduct+" With Total sales of: "+productTotal);

    }

    static void salesReport(int arr[][]){
        Scanner sc = new Scanner(System.in);
        int s;
        int e;
        int total = 0;

        System.out.println("Enter the starting day: ");
        s = sc.nextInt();
        System.out.println("Enter the ending day: ");
        e = sc.nextInt();

        if (s < 1 || e > 3) {
            System.out.println("Day out of range!!!");
        }else{
            for (int i = s-1; i < e; i++) {
                for (int j = 0; j < 7; j++) {
                    total += arr[i][j]; 
                }
                System.out.println("Day "+(i+1)+" total sale: "+total);
                total = 0;
            }
        }


        sc.close();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        int arr[][] = {
            {120, 130, 10, 5, 150, 160, 15},
            {120, 13, 140, 125, 150, 16, 135},
            {120, 130, 14, 125, 15, 160, 135}
        };


        System.out.println("1.Total sales");
        System.out.println("2.Best Selling Product");
        System.out.println("3.Sales Report");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                totalSales(arr);
                break;

            case 2:
                bestSellingProduct(arr);
                break;

            case 3:
                salesReport(arr);
                break;

            default:
                break;
        }


        sc.close();
    }



}
