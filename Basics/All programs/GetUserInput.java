import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int _int = sc.nextInt();

        System.out.println("Enter any Float: ");
        float _float = sc.nextFloat();

        System.out.println("Enter char value: ");
        char _char = sc.next().charAt(0);

        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Enter any Byte: ");
        Byte _byte = sc.nextByte();

        System.out.println("Enter Boolean: ");
        boolean bool = sc.nextBoolean();


        sc.close();


        System.out.println("Interger: " + _int);
        System.out.println("Float: " + _float);
        System.out.println("Character: " + _char);
        System.out.println("String: " + str);
        System.out.println("Byte: " + _byte);
        System.out.println("Boolean: " + bool);

    }
}