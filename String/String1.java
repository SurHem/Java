// String is class (An Immutable one)


// public class String1 {
      // public static void main(String[] args) {
        // String s = "Java";
        // String str = "Hello";

        // System.out.println(s.hashCode());
        // s = "Hello World!";
        // System.out.println(s.hashCode());

        // String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quam in, dolore at eum inventore fuga nihil esse. Ullam officiis consequatur molestiae vel quisquam, dolor tempore quos! Asperiores vero, Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quam in, dolore at eum inventore fuga nihil esse.";

        // String str1 = new String();
        // String str2 = new String("Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quam in, dolore at eum inventore fuga nihil esse. Ullam officiis consequatur molestiae vel quisquam, dolor tempore quos! Asperiores vero, Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quam in, dolore at eum inventore fuga nihil esse.");
      
        // Methods

        // System.out.println(str.charAt(10));
        // System.out.println(str.length());
        // System.out.println(str.substring(12));
        // System.out.println(str.substring(12, 20));
        // System.out.println(str.indexOf(' ',6));
        // System.out.println(str.lastIndexOf(' ',150));
        // System.out.println(str.startsWith("dolor",12));
        // System.out.println(str.endsWith("esse."));
        // System.out.println("Wish Has Lot Of Sona Chandi".toLowerCase());
        // System.out.println("Wish Has Lot Of Sona Chandi".toUpperCase());
        // System.out.println("before trim ->"+" W I S H ".trim()+"<- after trim");
        // System.out.println("Wish Has Lot Of Sona Chandi".replace(" ", "_"));
        // System.out.println(str.contains("sit"));
        // System.out.println("Wish Has Lot Of Sona Chandi".isEmpty());


        // int i = 12345;
        // String s = String.valueOf(i);
        // System.out.println(((Object)i).getClass().getSimpleName());
        // System.out.println(s.getClass().getSimpleName());

        // int j = Integer.valueOf(s);
        // System.out.println(j);
        // System.out.println(((Object)j).getClass().getSimpleName());

        // System.out.println("Hello ".concat("World!"));
        // System.out.println("Hello".equals("hello"));
        // System.out.println(String.format("\nthis is a string: -> %s\n%d", str,124));
        // System.out.printf("\nthis is a string: -> %s\n%d, %.2f",str , 124 , 12.22);


        // char c[] = {'a','_','b','_','c','_','d'};
        // String s = new String(c);
        // System.out.println(s);
      // }  
// }


/*
String Methods:
1. charAt(int index): Returns the character at the specified index.
2. length(): Returns the length of the string.
3. substring(int beginIndex): Returns a substring starting from the specified index.
4. substring(int beginIndex, int endIndex): Returns a substring within the specified range.
5. indexOf(int ch): Returns the index of the first occurrence of a specified character.
6. indexOf(int ch, int fromIndex): Returns the index of the first occurrence of a specified character starting from the given index.
7. indexOf(String str): Returns the index of the first occurrence of a specified substring.
8. lastIndexOf(int ch): Returns the index of the last occurrence of a specified character.
9. lastIndexOf(int ch, int fromIndex): Returns the index of the last occurrence of a specified character before the given index.  
10. lastIndexOf(String str): Returns the index of the last occurrence of a specified substring.
11. startsWith(String prefix): Checks if the string starts with the specified prefix.
12. endsWith(String suffix): Checks if the string ends with the specified suffix.
13. toLowerCase(): Converts the string to lowercase.
14. toUpperCase(): Converts the string to uppercase.
15. trim(): Removes leading and trailing white spaces.
16. replace(char oldChar, char newChar): Replaces all occurrences of a character with another character.
17. replaceAll(CharSequence target, CharSequence replacement): Replaces all occurrences of a specified CharSequence.
18. contains(CharSequence s): Checks if the string contains the specified sequence of characters.
19. isEmpty(): Checks if the string is empty.
20. valueOf(Object obj): Returns the string representation of an object.
*/





// interface P{
//   int a = 10;

//   int getA();
// }

// interface P1 extends P{
//   int b = 20;

//   int getB();
// }

// interface P2 extends P{
//   int c = 30;

//   int getC();
// }

// interface P12 extends P1,P2{
//   int d = 40;

//   int getD();
// }


// class Q implements P12{
//   @Override
//   public int getA(){
//     return a;
//   }

//   @Override
//   public int getB(){
//     return b;
//   }

//   @Override
//   public int getC(){
//     return c;
//   }

//   @Override
//   public int getD(){
//     return d;
//   }

//   void display(){
//     System.out.println("A: "+getA());
//     System.out.println("B: "+getB());
//     System.out.println("C: "+getC());
//     System.out.println("D: "+getD());
//   }

// }


// public class String1 {
//   public static void main(String[] args) {
//     Q q = new Q();
//     q.display();
//   }
// }