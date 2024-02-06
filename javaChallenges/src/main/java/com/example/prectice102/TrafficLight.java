/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice102;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author koush
 */
public class TrafficLight extends Thread{
    private TrafficLightColor color;

    public TrafficLight(TrafficLightColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s is active\n",color);
        try {
            Thread.sleep(color.getOnTimeMili());
        } catch (InterruptedException ex) {
            Logger.getLogger(TrafficLight.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.printf("%s is deactive\n",color);
    }
    
}
