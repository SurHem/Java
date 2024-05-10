package bank;

public class Transaction {
    public void transefer(Account sender , Account receiver , double amount){
        if (sender.getBalance() >= (amount+2000)) {
            sender.withdraw(amount);
            receiver.deposit(amount);
        
            System.out.println("Transfer of "+amount+" from " + sender.getAccHolderName()+" to "+ receiver.getAccHolderName() + " was successful.");
        }else{
            System.out.println("Transfer failed. Insufficient funds in the sender's account");
        }
    }
}
