//    Test Case:
//    - Input: text file "input.txt" containing:
     
    //  This is a test file.
    //  Hello, World!
    //  This is another test file.
     

//    - String to search: "test"
//    - Output:
     
//      num_line 1: This is a test file.
//      num_line 3: This is another test file.

import java.io.FileReader;
import java.util.Scanner;

class FindData{
    FileReader fin = null;
    int num_line = 1;
    String str = "";
    public void readFile(String folderPath, String fileName) {
        if (folderPath == null)
            folderPath = "";
        try{
            fin=new FileReader(folderPath+fileName+".txt");
            int i=0;
            while ((i = fin.read()) != -1) {
                str = str + (char) i;
                
                if (i == 10) {
                    if (str.contains("test")) {
                        System.out.println("Line: " + num_line + ": " + str);
                    }
                    str = "";
                    num_line++;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindData fh = new FindData();
        String folderPath = null, fileName = null;

        System.out.println("Enter the folderPath if any or leave empty for current directory:");
        folderPath = sc.nextLine();
        System.out.println("Enter the name of File:");
        fileName = sc.next();

        fh.readFile(folderPath, fileName);       
    }
}