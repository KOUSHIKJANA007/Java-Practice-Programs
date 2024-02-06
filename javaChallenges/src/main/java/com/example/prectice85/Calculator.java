/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice85;

class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("add of two integer: "+calculator.add(10, 20));
        System.out.println("add of two double: "+calculator.add(100.0, 223.0));
        System.out.println("add of three integer: "+calculator.add(10, 20,45));
    }
            
}
