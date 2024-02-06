
package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Koushik");
        list.add("Ranadeep");
        list.add("Purnendu");
        list.add("Mrinal");
        list.add("Dev");
        
        list.add(2, "Souvik");
        list.remove(5);
        
        list.set(3, "Soumadip");
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
//        for(String names:list){
//            System.out.println(names);
//        }
    }
}
