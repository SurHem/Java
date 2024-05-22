import java.io.FileReader;
import java.util.Scanner;

class ReadFile{    
    FileReader fin = null;
    Scanner sc = new Scanner(System.in);

    public void readFile(String folderPath, String fileName) {
        if (folderPath == null)
            folderPath = "";
        try{
            fin=new FileReader(folderPath+fileName+".txt");
            int i=0;
            while((i=fin.read()) !=-1){
                System.out.print((char)i);
            } 
            fin.close();
            System.out.println("\n\nEnd of File...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class FileHandler {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ReadFile rf = new ReadFile();
        String folderPath = null, fileName = null;
        
        System.out.println("Enter the folderpath if any or leave empty for the current directory:");
        folderPath = sc.nextLine();
        System.out.println("Enter the name of the file:");
        fileName = sc.next();

        rf.readFile(folderPath, fileName);
    }
}