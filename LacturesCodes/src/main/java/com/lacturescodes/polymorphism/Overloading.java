/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lacturescodes.polymorphism;

/**
 *
 * @author koush
 */
public class Overloading {
    public int add(int a,int b){
        return a+b;
    }
    public String add(String a,String b){
        return a+b;
    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        Overloading o=new Overloading();
        System.out.println(o.add(2,3));
        System.out.println(o.add("3", "4"));
        System.out.println(o.add(1, 34, 21, 30));
    }
}
