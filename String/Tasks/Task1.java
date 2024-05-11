// Text Analysis Tool: Develop a tool that analyzes a given text input, providing statistics such as character count, word count, average word length, and frequency of occurrence of certain words or phrases.

// Text Analysis Tool:
//    - Input: "This is a sample text for analysis. It contains words and punctuation marks!"
//    - Expected Output: 
//      - Character Count: 57
//      - Word Count: 10
//      - Average Word Length: 5.7
//      - Frequency of "text": 1
//      - Frequency of "analysis": 1

public class Task1 {
    public static void main(String[] args) {
        String input = "This is a sample text for analysis. It contains words and punctuation marks!";

        int char_count = input.length();
        System.out.println("Character Count: "+char_count);

        String words[] = input.split(" ");
        System.out.println("Word Count: "+words.length);
    
        float avg = 0;
        for (String str : words) {
            avg += str.length();
        }
        System.out.println("Average Word length: "+(avg/words.length));
    
        String text = "text";
        int freq = 0;
        for (String str : words) {
            if (str.contains(text)) {
                freq++;
            }
        }
        System.out.println("Frequency of text:"+freq);

        text = "analysis";
        freq = 0;
        for (String str : words) {
            if (str.contains(text)) {
                freq = freq+1;
            }
        }
        System.out.println("Frequency of \"analysis\":"+freq);
    }    
}