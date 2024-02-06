
package com.example.prectice93;

import com.example.prectice92.ListSwaping;
import java.util.List;
import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        for(int i=0;i<list.size()/2;i++){
            ListSwaping listSwaping=new ListSwaping();
            listSwaping.swap(list,i,list.size()-i-1);
        }
            System.out.println(list);
    }
}
