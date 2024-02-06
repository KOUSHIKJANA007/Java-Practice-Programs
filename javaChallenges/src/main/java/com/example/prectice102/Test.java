/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice102;

/**
 *
 * @author koush
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight red=new TrafficLight(TrafficLightColor.RED);
        TrafficLight yellow=new TrafficLight(TrafficLightColor.YELLOW);
        TrafficLight green=new TrafficLight(TrafficLightColor.GREEN);
        
        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
    }
}
