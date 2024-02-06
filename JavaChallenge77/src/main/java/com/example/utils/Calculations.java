
package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Ractangle;

public class Calculations {
    
    void circleArea(){
        Circle circle=new Circle(10.0);
        double r=circle.getRadious();
        double res=Math.PI*Math.pow(r, 2);
        System.out.println("Area of circle is: "+res);
        
    }
    void ractangleArea(){
        Ractangle rac=new Ractangle(10, 20);
        double l=rac.getLength();
        double w=rac.getWidth();
        double res=l*w;
        System.out.println("Area of ractrangle is:"+res);
    }
    public static void main(String[] args) {
        
        Calculations c=new Calculations();
        c.circleArea();
        c.ractangleArea();
    }
}
