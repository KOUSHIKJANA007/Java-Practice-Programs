package com.example.prectice95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqeCharacters {
    public static void main(String[] args) {
        Set<Character> uniqe=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.next();
        for(char ch:str.toCharArray()){
            uniqe.add(ch);
        };
        System.out.println("uniqe character length "+uniqe.size());
    }
}
