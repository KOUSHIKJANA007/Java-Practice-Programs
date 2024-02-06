/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice87;

import java.util.Scanner;

/**
 *
 * @author koush
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number for division:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        try {
            System.out.println("division : "+(num1/num2));
        } catch (ArithmeticException e) {
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Divided by zero exception");
            }else{
                throw e;
            }
        }
    }
}
