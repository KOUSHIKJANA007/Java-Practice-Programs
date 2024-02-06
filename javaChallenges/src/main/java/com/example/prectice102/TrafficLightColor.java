/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example.prectice102;

/**
 *
 * @author koush
 */
public enum TrafficLightColor {
    RED(3000),
    YELLOW(2000),
    GREEN(3000);
    
    private final int onTimeMili;

    public int getOnTimeMili() {
        return onTimeMili;
    }
    

    private TrafficLightColor(int onTimeMili) {
        this.onTimeMili = onTimeMili;
    }
    
}
