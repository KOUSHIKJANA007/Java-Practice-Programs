import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int[] a=new int[size];
        int i=0;
        System.out.println("enter array elements");
        while (i<a.length) {
            a[i]=sc.nextInt();
            i++;
        }
        System.out.println("maximun="+maximum(a));
        System.out.println("minimun="+minimum(a));
    }
    public static int maximum(int[] a){
        int i=1;
        int big=a[0];
        while (i<a.length-1) {
            if(a[i]>big){
                big=a[i];
            }
            i++;
        }
        return big;
    }
    public static int minimum(int[] a){
        int i=1;
        int small=a[0];
        while (i<a.length-1) {
            if(a[i]<small){
                small=a[i];
            }
            i++;
        }
        return small;
    }
}
