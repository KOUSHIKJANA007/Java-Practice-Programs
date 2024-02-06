/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice101;

/**
 *
 * @author koush
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        PrintTread t1=new PrintTread(1);
        PrintTread t2=new PrintTread(2);
        PrintTread t3=new PrintTread(3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
