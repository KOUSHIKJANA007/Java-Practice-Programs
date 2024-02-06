package com.example.collections;

import java.util.*;

public class CollectionClass {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(48);
        list.add(20);
        list.add(34);
        printList(list);
        Collections.sort(list);
        printList(list);
        Collections.shuffle(list);
        printList(list);
        Collections.reverse(list);
        printList(list);
    }

    public static void printList(List list) {
        for (Object l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
}
