package com.example.multithreading;

public class needOfMultithreading {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i = 1; i < 1000; i++) {
            System.out.print("Koushik ");
        }
        System.out.println(); 
        for (int i = 1; i < 1000; i++) {
            System.out.print("Purnendu ");
        }
        System.out.println("");
        for (int i = 1; i < 1000; i++) {
            System.out.print("Rana ");
        }
        System.out.println("");
        long endTime=System.currentTimeMillis();
        System.out.printf("Total time taken %d",(endTime-startTime));
    }
}
