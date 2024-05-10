class Overload{
    public static void display(int a){
        System.out.println("Arguments: "+a);
    }

    public static void display(int a , int b){
        System.out.println();
    }

    public static void display(String a){
        System.out.println("Got String paramenter: "+a);
    }

    public static void display(String a, String b){
        System.out.println("Got String Parameter: \""+a+"\" and \""+b+"\"");
    }
}

public class MT_Overloading{
    public static void main(String[] args) {
        Overload.display(23);
        Overload.display(3,34);

        Overload.display("string");
        Overload.display("string","str");
    }
}  