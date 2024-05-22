import java.io.FileReader;
import java.util.Scanner;

class ReadFile{
    FileReader fin = null;
    int count = 0,flag=0;
    public void countWords(String folderPath, String fileName) {
        if (folderPath == null)
            folderPath = "";
        try{
            fin=new FileReader(folderPath+fileName+".txt");
            int i=0;
            while ((i = fin.read()) != -1) {
                if (i == 32 || i == 46) {
                    count++;
                }
            }
            
            System.out.println("Total Number of words in the file is:"+(count+1));
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadFile rf = new ReadFile();
        String folderPath = null, fileName = null;
        
        System.out.println("Enter the folderPath if any or leave empty for the current Directory:");
        folderPath = sc.nextLine();
        System.out.println("Enter the name of File:");
        fileName = sc.next();

        rf.countWords(folderPath, fileName);
    }
}