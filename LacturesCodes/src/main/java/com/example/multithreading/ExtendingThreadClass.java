/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.multithreading;

/**
 *
 * @author koush
 */
public class ExtendingThreadClass {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1=new FirstTask();
        SecondTask t2=new SecondTask();
        ThirdTask t3=new ThirdTask();
        System.out.println("\n first task started");
        t1.start();
        System.out.println("\n second task started");
        t2.start();
        System.out.println("\n third task started");
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken [%d]   ",Thread.currentThread().getName(), (endTime - startTime));
    }
}
