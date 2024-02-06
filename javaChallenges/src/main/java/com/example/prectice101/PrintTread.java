/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice101;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author koush
 */
public class PrintTread extends Thread {

    private final int threadNumber;

    public PrintTread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s thread starting-%d ", Thread.currentThread().getName(), threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PrintTread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.printf("%s thread ending-%d ", Thread.currentThread().getName(), threadNumber);
    }

}
