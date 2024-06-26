package bank;

public class Account {
    private String accNo;
    private String accHolderName;
    private double balance;


    public Account(String accNo , String accHolderName , double balance){   
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public String getAccNo(){
        return accNo;
    }

    public String getAccHolderName(){
        return accHolderName;
    }


    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit of "+amount+" is successful. New balance is: "+balance);
    }

    public void withdraw(double amount){
        if(balance >= amount && (balance - amount)>2000){
            balance -= amount;
            System.out.println("Withdrawl of "+amount+" is successful. New balance is: "+balance);
        }else{
            System.out.println("Insufficient balance. Withdrawl of "+amount+" was unsuccessful!!");
        }
    }
}
