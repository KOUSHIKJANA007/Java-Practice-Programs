/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.multithreading.runneableMultiThreading;

/**
 *
 * @author koush
 */
public class PrintTask implements Runnable{

    @Override
    public void run() {
       for (int i = 1; i < 1000; i++) {
            System.out.print(targetChar+ " ");
        }
        System.out.printf("\n %s %s completed",Thread.currentThread().getName(),targetChar); 
    }
    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
    
}
