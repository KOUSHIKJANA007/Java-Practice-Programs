package com.example.varargs;

public class Varargs {

    public static void main(String[] args) {
        System.out.println("sum : "+sum(1,2,45,2,7,9));
    }

    public static int sum(int first,int second,int... a) {
        int sum = first+second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
