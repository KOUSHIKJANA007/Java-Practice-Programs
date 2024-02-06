
package com.example.prectice78;


public class BankAccount {
    private long accountNumber;
    private String accHolderName;
    private double balance;
    
    public void deposit(long money){
        if(money<=0){
            System.out.println("Invaild");
        }
        else{
        balance=balance+money;
        }
    }
    public double withdrew(long money){
        if(money>balance){
            System.out.println("Insuffisient balance");
        }
        else if(money<=0){
             System.out.println("INVALID MONEY TO BE ADD");
        }  
        else{
            balance=balance-money;
        }
        return balance;
    }

    public BankAccount() {
    }

    public BankAccount(long accountNumber, String accHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }


    public double getBalance() {
        return balance;
    }

   
    
    
    
}
