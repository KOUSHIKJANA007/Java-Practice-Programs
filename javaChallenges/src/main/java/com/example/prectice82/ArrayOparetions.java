package com.example.prectice82;

public class ArrayOparetions {
    private int[] numbers;

    public ArrayOparetions(int[] numbers) {
        this.numbers = numbers;
    }
    
    
    public class Statistic{
        double mean(){
            double sum=0.0;
            for(int number:numbers){
                sum += number;
            }
            return sum / numbers.length;
        }
    }
}
