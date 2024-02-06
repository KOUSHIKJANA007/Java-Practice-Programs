/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice86;

/**
 *
 * @author koush
 */
public class Car extends Vehicle{

    @Override
    public void service() {
        super.service();  //call perent service method
        System.out.println("Car is servicing.......");
    }
    
}
