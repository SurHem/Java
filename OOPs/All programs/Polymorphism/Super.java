class Mathematician{
    String name;
    int age;
    String degree;


    Mathematician(String degree){
        this.degree = degree;
    }


    void display(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nDegree: " + degree);
    }
}


class Duffers extends Mathematician{

    Duffers(String name , int age , String degree){
        super(degree);
        super.name = name;
        super.age = age;
    }


    void display(){
        super.display();
    }
}


public class Super {
    public static void main(String[] args) {
        Duffers av = new Duffers("Mohak", 19, "PhD");
        av.display();

        Duffers r = av;  //Copying this object
        r.name = "Wish";
        r.age = 20;
        r.degree = "None";

        r.display();
        av.display();

        System.out.println(r.hashCode() + " - "+av.hashCode());
    }
}
