
package com.example.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number for division:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        try {
            System.out.println("division : "+(num1/num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Throwable th){
            th.printStackTrace();
        }
    }
            
}
