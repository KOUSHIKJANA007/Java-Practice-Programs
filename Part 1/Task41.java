import java.util.Scanner;

public class Task41 {
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
        System.out.println("Enter number to check occurence");
        int num=sc.nextInt();
        System.out.println(num+" is occure "+checkOccurence(a, num)+" times");
    }
    public static int checkOccurence(int[] a,int num){
        int i=0;
        int count=0;
        while (i<a.length) {
            if(a[i]==num){
                count++;
            }
            i++;
        }
        return count;
    }

}
