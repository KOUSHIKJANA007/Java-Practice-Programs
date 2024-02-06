/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice99;

/**
 *
 * @author koush
 */
public class Test {
    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample(1);
        ThreadExample t2=new ThreadExample(2);
        t1.start();
        t2.start();
    }
}
