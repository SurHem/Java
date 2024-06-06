// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
// 2. Write a Java program to iterate through all elements in an array list.
// 3. Write a Java program to insert an element into the array list at the first position.
// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
// 5. Write a Java program to update an array element by the given element.
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(5);
        arr.add(4);

// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

//         ArrayList<String> colors = new ArrayList<>();

//         colors.add("Red");
//         colors.add("Yellow");
//         colors.add("Green");

//         System.out.println(colors);


// 2. Write a Java program to iterate through all elements in an array list.


//         ArrayList<Integer> arr = new ArrayList<>();

//         arr.add(1);
//         arr.add(2);
//         arr.add(3);
//         arr.add(4);

//         for (int i = 0; i < 4; i++) {
//             System.out.println(arr.get(i));
//         }




// 3. Write a Java program to insert an element into the array list at the first position.



        // arr.add(0, 10);
        // System.out.println(arr.get(0));

    // 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);

        // System.out.print("Enter the index: ");
        // int indx = sc.nextInt();

        // System.out.println(arr.get(indx));

    // 5. Write a Java program to update an array element by the given element.

        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);

        // System.out.print("Enter the index at which you want to update: ");
        // int indx = sc.nextInt();
        // System.out.print("\nEnter the value: ");
        // int value = sc.nextInt();

        // arr.set(indx, value);

        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.println(arr.get(i));
        // }

        // 6. Write a Java program to remove the third element from an array list.
        // arr.add(1);
        // arr.add(3);
        // arr.add(2);
        // arr.add(5);
        // arr.add(4);

        // arr.remove(2);

    

        // 7. Write a Java program to search for an element in an array list.
            // System.out.print("Enter the element you want to search: ");
            // int ele = sc.nextInt();

            
            // System.out.println(arr.contains(ele));

        // 8. Write a Java program to sort a given array list.
            // for (int i = 0; i < arr.size(); i++) {
            //     for (int j = 0; j < arr.size()-1-i; j++) {
            //         if (arr.get(j) > arr.get(j+1)) {
            //             int temp = arr.get(j);
            //             arr.set(j,arr.get(j+1));
            //             arr.set(j+1, temp);
            //         }
            //     }
            // }

            // for (int i = 0; i < arr.size(); i++) {
            //     System.out.println(arr.get(i));
            // }


        // 9. Write a Java program to copy one array list into another.
            // ArrayList<Integer> arr1 = new ArrayList<>();

            // arr1.addAll(arr);
            // arr1 = arr;
            // for (int i = 0; i < arr.size(); i++) {
            //     System.out.println(arr.get(i));
            // }



        // 10. Write a Java program to shuffle elements in an array list.



        // 11. Write a Java program to reverse elements in an array list.
        // ArrayList<Integer> arr1 = new ArrayList<>();
        // for (int i = arr.size()-1; i >= 0; i--) {
        //     arr1.add(arr.get(i));
        // }
        // for (int i = 0; i < arr1.size(); i++) {
        //     System.out.println(arr1.get(i));
        // }
            

        // 12. Write a Java program to extract a portion of an array list.
            // System.out.print("Enter the starting index: ");
            // int sindex = sc.nextInt();
            // System.out.print("\nEnter the ending index: ");
            // int eindex = sc.nextInt();

            // for (int i = sindex; i <= eindex; i++) {
            //     System.out.println(arr.get(i));
            // }

        // 13. Write a Java program to compare two array lists.
        // ArrayList<Integer> arr1 = new ArrayList<>();
        // arr1.add(1);
        // arr1.add(2);
        // arr1.add(3);
        // arr1.add(4);
        // arr1.add(5);
        // arr1.add(2);
        // if (arr.size() != arr1.size()) {
        //     System.out.println("Not equal!!");
        // }else{
        //     boolean isequal = true;
        //     for (int i = 0; i < arr.size() && isequal == true; i++) {
        //         if (arr.get(i) != arr1.get(i)) {
        //             isequal = false;
        //         }
        //     }

        //     if (isequal) {
        //         System.out.println("Both are equal!!");
        //     }else{
        //         System.out.println("Not euqal!!");
        //     }
        // }

        // 14. Write a Java program that swaps two elements in an array list.
            // System.out.print("Enter the first position: ");
            // int pos1 = sc.nextInt()-1;
            // System.out.print("Enter the second position: ");
            // int pos2 = sc.nextInt()-1;

            // if (pos1 < 0 || pos2 > arr.size()-1) {
            //     System.out.println("Invalid position!!");
            // }else{
            //     int temp = arr.get(pos1);
            //     arr.set(pos1,arr.get(pos2));
            //     arr.set(pos2, temp);
            // }

           
            // for (int i = 0; i < arr.size(); i++) {
            //     System.out.println(arr.get(i));
            // }
            

        // 15. Write a Java program to join two array lists.
        // ArrayList<Integer> arr1 = new ArrayList<>();
        // arr1.add(1);
        // arr1.add(2);
        // arr1.add(3);
        // arr1.add(4);
        // arr1.add(5);               

        // arr.addAll(arr1);

        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.println(arr.get(i));
        // }

        // 17. Write a Java program to empty an array list.

            // arr.clear();
            // System.out.println(arr.size());

        // 18. Write a Java program to test whether an array list is empty or not.


        // if (arr.size() == 0) {
        //     System.out.println("ArrayList is Empty!!");
        // }else{
        //     System.out.println("ArrayList is not Empty!!");
        // }    



        // 21. Write a Java program to replace the second element of an ArrayList with the specified element.
        //     System.out.print("Enter the element: ");
        //     int ele = sc.nextInt();

        //     arr.set(1, ele);
        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.println(arr.get(i));
        // }


        // 22. Write a Java program to print all the elements of an ArrayList using the elements' position.
            
        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.println("Position: "+(i+1) + "  Value: " + arr.get(i));
        // }
    
    }
}