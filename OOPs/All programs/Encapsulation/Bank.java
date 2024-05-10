import bank.Account;
import bank.Transaction;

public class Bank {
    public static void main(String[] args){
        Account father = new Account("12345", "Father", 100_000);
        Account son = new Account("54321", "Son", 50_000);

        System.out.println("Initial Balances:");
        System.out.println(father.getAccHolderName() + ": "+father.getBalance());
        System.out.println(son.getAccHolderName()+": "+son.getBalance());

        Transaction transaction = new Transaction();
        transaction.transefer(father, son, 50_000);

        System.out.println("Final balances after transfer:");
        System.out.println(father.getAccHolderName() + ": "+father.getBalance());
        System.out.println(son.getAccHolderName()+": "+son.getBalance());
    }
}
