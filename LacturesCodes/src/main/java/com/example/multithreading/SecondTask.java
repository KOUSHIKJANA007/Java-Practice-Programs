/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.multithreading;

/**
 *
 * @author koush
 */
public class SecondTask extends Thread{

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.print("Purnendu ");
        }
        System.out.printf("\n %s Purnendu completed",Thread.currentThread().getName());
    }
    
}
