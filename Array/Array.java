import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print("\nEnter arr["+i+"] = ");
        //     arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ", ");
        // }
        // System.out.println();

        // Arrays.sort(arr);   //sort array
        // for (int i : arr) {
        //     System.out.print(i + ", ");
        // }

        // System.out.println(Arrays.toString(arr));

        // int[] arr[] = new int[2][2];
        int[][] arr = { {1, 2}, {3, 4} };
        for (int[] is : arr) {
            // System.out.println(Arrays.toString(is));
            // System.out.println(is);
            for (int a : is) {
                System.out.print(a + ", ");
            }
        }
    
    }
}