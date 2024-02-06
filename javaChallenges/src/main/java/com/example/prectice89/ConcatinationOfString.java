package com.example.prectice89;

public class ConcatinationOfString {
    public static void main(String[] args) {
        String res=concatination("koushik","jana","Hello","Hi");
        String res1=concatination("Prachi");
        System.out.println(res);
        System.out.println(res1);
        
    }
    public static String concatination(String...a){
        String c="";
        for(String element:a){
            c=c.concat(element).concat(" ");
        }
        return c;
    }
}
