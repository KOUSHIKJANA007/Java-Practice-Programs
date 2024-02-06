package com.example.prectice92;

import java.util.Arrays;
import java.util.List;


public class ListSwaping {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(23,54,12,87,9);
        System.out.println(list);
        swap(list,0,1);
        System.out.println(list);
        
    }
    public static void swap(List<Integer> list,int x,int y){
        int swap=list.get(x);
        list.set(x,list.get(y));
        list.set(y, swap);
    }
}
