/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.multithreading;

/**
 *
 * @author koush
 */
public class FirstTask extends Thread{

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.print("Koushik ");
        }
        System.out.printf("\n %s Koushik completed",Thread.currentThread().getName());
    }
    
}
