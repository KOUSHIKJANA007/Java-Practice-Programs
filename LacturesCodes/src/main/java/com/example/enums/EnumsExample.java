package com.example.enums;


public class EnumsExample {
    public static void main(String[] args) {
        TraficLight color=TraficLight.GREEN;
        
        for(TraficLight t:TraficLight.values()){
            System.out.println(t);
        }
    }
}
