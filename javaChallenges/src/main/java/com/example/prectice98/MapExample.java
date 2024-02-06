
package com.example.prectice98;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("India", "Dehli");
        map.put("Australia", "Canberra");
        map.put("Cuba", "Havana");
        map.put("Japan", "Tokyo");
        map.put("Kenya", "Nairobi");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter country name to get capital name:");
        String name=sc.next();
        if(map.containsKey(name)){
            System.out.printf("Capital of %s is %s ",name,map.get(name));
        }else{
            System.out.println("Conntry not found");
        }
    }
            
}
