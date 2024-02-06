package com.example.prectice99;


public class ThreadExample extends Thread{

    private final int threadNumber;

    public ThreadExample(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n(%d) Hello,from Thread-%d ",i,threadNumber);
        }
 
    }
    
}
