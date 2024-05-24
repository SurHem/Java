//    Test Case: (Encryption)
//    - Input: text file "input.txt" containing:
     
//      Hello, World!
     

//    - Output: Encrypted text file "encrypted.txt" containing encrypted data.

//    Test Case: (Decryption)
//    - Input: Encrypted text file "encrypted.txt"
//    - Output: Decrypted text file "decrypted.txt" containing:
     
//      Hello, World!
     

import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

class ReadWrite {
    FileWriter fout = null;
    FileReader fin = null;

    public void encrypt() {
        Scanner sc = new Scanner(System.in);
        String data;
        System.out.println("Enter the data you want Encrypt: ");
        data = sc.nextLine();
        try {
            fout = new FileWriter("data.txt");
            fout.write(data);

            fout.close();

            fin = new FileReader("data.txt");
            fout = new FileWriter("Encrypted.txt");

            int i = 0;
            while ((i = fin.read()) != -1) {
                fout.write((char)(i+2));
            }
            fout.close();
            fin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void decrypt(){
        try{
            fin = new FileReader("Encrypted.txt");
            fout = new FileWriter("Decrypted.txt");

            int i = 0;
            while ((i = fin.read()) != -1) {
                fout.write((char)(i-2));
            }

            fin.close();
            fout.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadWrite fh = new ReadWrite();
        
        fh.encrypt();
        fh.decrypt();

    }
}