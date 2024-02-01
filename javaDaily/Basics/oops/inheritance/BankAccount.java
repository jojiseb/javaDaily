package inheritance;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if(initialBalance > 0)
            this.balance = initialBalance;
    }

    public void depositMoney(double depositAmt) {
        if(depositAmt > 0)
            balance += depositAmt;
    }

    public boolean withdraw(double withdrawnAmt) {
        if(withdrawnAmt > 0 && withdrawnAmt >= balance) {
            return true;
        }
        return false;
    }

    public String toString() {
        return ("Balance : "+balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2000);
        System.out.println(bankAccount);
    }
}
