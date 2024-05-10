class Way1 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" -> Hello there!!!");
    }
}

class Way2 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" -> Hello there!!!");
    }
}

public class MultiThreading {
    public static void main(String[] args){

        Way1 way1 = new Way1();
        Way2 way2 = new Way2();

        // Way3
        Thread way3 = new Thread();


        way1.run();
        way2.run();
        way3.run();
    }
}
