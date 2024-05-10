final class Bike{
    final int speedLimit = 90;

    // void run(){ this will give error cause we can't chage final variable
    //     speedLimit = 200;
    // }

    final void run(){
        System.out.println("Final run method!");
    }
}


class Suzuki /*extends Bikes*/{
    // @Override
    // void run(){
    //     System.out.println("runnning safely with 100kmph");
    //     super.run();
    // }
}


public class Final_KW {
    public static void main(String[] args) {
        Suzuki hayabusa = new Suzuki();
        // hayabusa.run();
        // System.out.println(hayabusa.speedLimit);
    }
}


// Final Keyword: it is used to restrict the user from accessing certain things in the program.
// (acts like a constant)

// Final can be: 
// 1. variable: stop value change
// 2. method: stop method overriding
// 3. class: stop inheritance
