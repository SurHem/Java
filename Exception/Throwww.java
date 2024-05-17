// class MyException extends ArithmeticException{
//     MyException(String m){
//         super(m);
//     }
// }
// public class CheckException {
    
//     public void divideByZero(double a,double b) throws MyException{
//         try{
//             if(b==0){
//                 throw new MyException("Divide by Zero not possible!!!");
//             }else{
//                 System.out.println("division:"+a/b);
//             }
//         }catch(MyException e){
//             System.out.println("Exception Caught:"+e.getMessage());
//         }
//     }
//     public static void main(String[] args) {
        
//         CheckException c=new CheckException();
//         c.divideByZero(20, 5);
//         c.divideByZero(20, 0);
//     }
// }



class Vishwa {
    public static void study(double hours) {
        try{
            if(hours <= 1) throw new ArithmeticException("I'll get less than 22...");
            else System.out.println("This should be enough for the day...");
            
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void divide(double one, double two) {
        try{
            if (two == 0) {
                throw new ArithmeticException("Stupid!");
            }
            else{

                System.out.println("Division:"+one/two);
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

// class ClassWork {
//     public static void loadClass(String path) throws ClassNotFoundException {
//         if(path.isEmpty()) throw new ClassNotFoundException();
//         else Class.forName(path);
//     }
// }

public class Throwww {
    public static void main(String[] args) {
        //Example 1: Throwing unchecked exception
    
            Vishwa.study(0.6);  //exception may occur here
            Vishwa.divide(2, 1);
        
        
        //Example 2: Throwing checked exception
        
        
        // try {
        //     ClassWork.loadClass("java.util.Scanner");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // System.out.println("rest of the code");
    }
}