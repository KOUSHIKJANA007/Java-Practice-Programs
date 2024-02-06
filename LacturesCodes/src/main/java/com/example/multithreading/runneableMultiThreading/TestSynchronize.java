package com.example.multithreading.runneableMultiThreading;

public class TestSynchronize {
    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        Counter counter=new Counter();
        SynchronizeThread t1=new SynchronizeThread(counter);
        SynchronizeThread t2=new SynchronizeThread(counter);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        long endTime=System.currentTimeMillis();
        System.out.printf("Value of counter %d, Time %d ",counter.getCounter(),(endTime-startTime));
    }
}
