import java.io.BufferedReader;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
        String csvFile = "text.csv";
        String line, delim=",";
        int totalGrades = 0, count = 0;
        

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] student = line.split(delim);

                if(student.length == 3) {
                    int grade = Integer.parseInt(student[2].trim());
                    totalGrades += grade;
                    count++;
                }
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(count > 0) {
            double averageGrade = (double) totalGrades / count;
            System.out.printf("\nAverage Grade: %.2f", averageGrade);
        } else {
            System.out.println("No stduent data found!");
        }
    }
}