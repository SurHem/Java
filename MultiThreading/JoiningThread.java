class MyThread extends Thread{
    private int num;

    public MyThread(String str , int num){
        super(str);
        this.num = num;
    }

    public MyThread(int num){
        super();
        this.num = num;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class JoiningThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(5);
        MyThread t2 = new MyThread(10);

        
    }
}
