/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice83;

/**
 *
 * @author koush
 */
public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }
    

    
    @Override
    public void calculateArea() {
        System.out.println("Area of square is: "+(Math.pow(side, 2)));
    }
    
}
