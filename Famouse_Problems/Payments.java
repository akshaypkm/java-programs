package Famouse_Problems;
public class Payments{
    public static void main(String[] args){
        PaymentMethod upi = new UPIPayment();

        PaymentMethod card = new CardPayment();

        upi.authenticateUser(123);
        upi.pay(50);

        System.out.println(upi.balanceCheck());

        card.authenticateUser(123);
        card.pay(10);
    }
}

interface TransactionLogger{
        void logTransaction(String message);
    }

abstract class PaymentMethod {
    abstract void authenticateUser(int checkId);

    
    abstract double balanceCheck();
    
    public double pay(double amount){
        System.out.println("Pay needs to be either upi or card");
        return amount;
    }

    
}

class UPIPayment extends PaymentMethod implements TransactionLogger{
    private int userId = 123;
    private double balance = 100;

    public void logTransaction(String message){
        System.out.println("From UPI: "+message);
    }

    public double balanceCheck(){
        return balance;
    }

    public void authenticateUser(int checkId){
        if(checkId == userId)
        logTransaction("User id matched");
    }

    

    public double pay(double amount){
        if(balance>=amount){
            balance -=  amount;
        }else{
            logTransaction("Insufficient balance you bastard");
        }
        return balance;
    }
    
    
}

class CardPayment extends PaymentMethod implements TransactionLogger{
    private int userId = 123;
    private double balance = 100;
    private int origCardNum = 1001;

    public void authenticateUser(int checkId){
        if(checkId == userId)
        logTransaction("User id matched");
    }

    public void logTransaction(String message){
        System.out.println("From CARD: "+message);
    }

    public double pay(int cardNum, double amount){
        if(cardNum == origCardNum){
            logTransaction("card is valid, processing payment");
            
            if(balance>=amount)
                {balance = balance - amount;}
            else{logTransaction("Not enough bank balance, earn you fucker!");}
        }else{
            logTransaction("From whom did you steal the card you cock");
        }
        return balance;
    }
    

    public double balanceCheck(){
        return balance;
    }
}
