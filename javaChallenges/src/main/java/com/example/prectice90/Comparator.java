/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice90;

import java.util.*;

/**
 *
 * @author koush
 */
public class Comparator {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Lion","Tiger","Bear");
        sortDesc(list);
        System.out.println(list);
    }
    public static void sortDesc(List<String> list){
        Collections.sort(list, new java.util.Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                }else if(o1.charAt(0)<o2.charAt(0)){
                    return 1;
                }else{
                    return -1;
                }
            }
            
        });
    }
}
