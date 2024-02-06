import java.util.Scanner;

public class Task43 {
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
        boolean res1=isIncresing(a);
        boolean res2=isDecresing(a);
        if(res1){
            System.out.println("sorted in incresing order");
        }
        else if(res2){
            System.out.println("sorted in decresing order");
        }
        else{
            System.out.println("not sorted");
        }

    }

    public static boolean isIncresing(int[] a){
        int i=0;
        boolean f=true;
        while (i<a.length-1) {
            if(a[i]>a[i+1]){
                f=false;
            }
            i++;
        }
        return f;
    }
    public static boolean isDecresing(int[] a){
        int i=0;
        boolean f=true;
        while (i<a.length-1) {
            if(a[i]<a[i+1]){
                f=false;
            }
            i++;
        }
        return f;
    }
}
