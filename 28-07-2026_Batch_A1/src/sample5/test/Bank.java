package sample5.test;

public class Bank {
    public static void main(String[]args){
        Bank1 b=new Bank1();
        b.setPin(2006);//Intialising the pin value
        b.deposite(2006,500,80);
        b.deposite(2006,500,80);
    }
}
class Bank1{
    String acc_number;
    String acc_HolderName;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    private int pin;
    String acc_type;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;
    //deposite,withdrawl, checkBalance
    void deposite(int entered_pin,double amount){
        if(entered_pin==pin){
            balance+=amount;
            System.out.println("Amount Deposited Successfully");
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
    void withdrawl(int entered_pin,double amount){
        if(entered_pin==pin) {
            if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Amount Withdrawn Successfully");
            }
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
    void checkbalance(int entered_pin,double amount){
        if(entered_pin==pin){
                balance+=amount;
                System.out.println("Amount Deposited Successfully");
            }
            else{
                System.out.println("Invalid Pin");
            }
        }

    }




