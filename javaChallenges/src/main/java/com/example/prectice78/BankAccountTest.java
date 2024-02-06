
package com.example.prectice78;


public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(1234567,"Koushik Jana",300000);
        
        account.deposit(1000);
        System.out.println("Balance: "+account.getBalance());
        account.withdrew(1000);
        account.withdrew(-1000);
        account.deposit(-30);
        account.withdrew(4000000);
    }
}
