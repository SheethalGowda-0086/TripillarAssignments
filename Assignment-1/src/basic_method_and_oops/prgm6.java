package basic_method_and_oops;

public class prgm6 {
    static class BankAccount {
        int accountNumber;
        double balance;
        void deposit(double amount){
            balance += amount;
        }
        void withdraw(double amount){
            if(amount<=balance) balance -= amount;
            else System.out.println("Insufficient balance");
        }
        void display(){
            System.out.println(balance);
        }
    }
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.accountNumber=101;
        b.deposit(1000);
        b.withdraw(200);
        b.display();
    }
}
