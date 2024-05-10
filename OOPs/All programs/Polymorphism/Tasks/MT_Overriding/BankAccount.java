// Bank Account System
// In a bank account system, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "CurrentAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.

class Account{
    double interest;

    void calculateInterest(double interest){
        this.interest = interest;
        System.out.println("Calculated interest");
    };

}


class SavingsAccount extends Account{
    
    @Override
    void calculateInterest(double interest){
        super.interest = interest;
        System.out.println("Calculated interest of "+this.getClass().getName()+" with "+super.interest+" interest");
    }
}

class CurrentAccount extends Account{
    
    @Override
    void calculateInterest(double interest){
        super.interest = interest;
        System.out.println("Calculated interest of "+this.getClass().getName()+" with "+super.interest+" interest");
    }
}



public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        CurrentAccount c = new CurrentAccount();

        s.calculateInterest(5.5);
        c.calculateInterest(2.9);
    }
}
