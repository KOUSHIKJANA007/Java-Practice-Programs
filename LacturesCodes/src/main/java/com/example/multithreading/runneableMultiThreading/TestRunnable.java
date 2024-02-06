/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.multithreading.runneableMultiThreading;

/**
 *
 * @author koush
 */
public class TestRunnable {
    public static void main(String[] args) {
        PrintTask p1=new PrintTask('*');
        PrintTask p2=new PrintTask('$');
        PrintTask p3=new PrintTask('#');
        
        Thread t1=new Thread(p1);
        t1.start();
        Thread t2=new Thread(p2);
        t2.start();
        Thread t3=new Thread(p3);
        t3.start();
    }
}
