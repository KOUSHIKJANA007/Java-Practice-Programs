package com.example.prectice82;


public class Test {
    public static void main(String[] args) {
        ArrayOparetions ao=new ArrayOparetions(new int[]{1,2,3,4,5,6} );
        ArrayOparetions.Statistic st=ao.new Statistic();
        System.out.println("mean: "+st.mean());
    }
}
