import java.util.Scanner;

public class Task40 {
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
        System.out.println("sum: "+sumAllElements(a));
        System.out.println("Average: "+avrageAllElements(a));
    }
    public static int sumAllElements(int[] a){
        int sum=0;
        int i=0;
        while (i<a.length) {
            sum +=a[i];
            i++;
        }
        return sum;
    }
    public static int avrageAllElements(int[] a){
        int sum=0;
        int i=0;
        while (i<a.length) {
            sum +=a[i];
            i++;
        }
        return sum/a.length;
    }
}
