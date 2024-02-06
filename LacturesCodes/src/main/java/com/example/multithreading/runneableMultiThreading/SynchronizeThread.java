
package com.example.multithreading.runneableMultiThreading;
class Counter{
    private int count=0;
    public synchronized void increment(){
        count++;
    }
    public int getCounter(){
        return count;
    }
}
class SynchronizeThread extends Thread{
    private final Counter counter;

    public SynchronizeThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
    
    
}
