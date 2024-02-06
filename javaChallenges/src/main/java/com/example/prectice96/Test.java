/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice96;

/**
 *
 * @author koush
 */
public class Test {
    public static void main(String[] args) {
        for(Day day:Day.values()){
            System.out.println(day);
        }
        
        System.out.println(Day.valueOf("MONDAY"));
        
    }
}
