package inheritance;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if(initialBalance > 0)
            this.balance = initialBalance;
        System.out.println("Super : "+super.getClass().getSimpleName());    //returns simple name of runtime class of the current object - BankAccount
        System.out.println("this : "+this.getClass().getSimpleName());  //returns simple name of runtime class of the current object - BankAccount
    }

    public void depositMoney(double depositAmt) {
        if(depositAmt > 0)
            balance += depositAmt;
    }

    public boolean withdraw(double withdrawnAmt) {
        if(withdrawnAmt > 0 && balance >= withdrawnAmt) {
            balance -= withdrawnAmt;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(20000);
        System.out.println(bankAccount);
        System.out.println("Balance is : "+bankAccount.getBalance());
        bankAccount.depositMoney(15000);
        System.out.println("Balance after deposit : "+bankAccount.getBalance());
        bankAccount.withdraw(2000);
        System.out.println("After withdrawing money, balance is : "+bankAccount.getBalance());
    }
}
