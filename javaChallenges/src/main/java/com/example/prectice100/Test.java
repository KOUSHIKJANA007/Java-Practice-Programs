/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice100;

/**
 *
 * @author koush
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1=new ThreadState();
        System.out.printf("State: %s \n",t1.getState());
        
        t1.start();
        System.out.println("State: "+t1.getState());
        t1.join();
        System.out.println("State: "+t1.getState());
    }
}
