/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpm.example.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author koush
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Koushik", 100);
        map.put("Purnendu", 90);
        map.put("Rana", 80);
        map.put("Soumya", 70);
        map.put("raghu", 70);
        System.out.println(map.size());
        System.out.println(map.containsKey("Koushik"));
        System.out.println(map.containsValue(100));
        map.remove("raghu");
        System.out.println(map.size());
        for(String key:map.keySet()){
            System.out.printf("%s : %s\n",key,map.get(key));
        }
        
    }
}
