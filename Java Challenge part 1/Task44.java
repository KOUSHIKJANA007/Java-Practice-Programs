import java.util.Scanner;

public class Task44 {
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
        System.out.println("Enter delete element:");
        int num=sc.nextInt();
        deleteLocation(a, num);
    }

    public static int countOcurrence(int[] a,int num){
        int i=0;
        int c=0;
        while (i<a.length) {
            if(a[i]==num){
                c++;
            }
            i++;
        }
        return c;
    }
    public static void deleteLocation(int[] a,int num){
        int i=0,j=0,k=0;
        int size=(a.length)-countOcurrence(a, num);
        System.out.println(size);
        int[] b=new int[size];
        while (i<a.length) {
            if(a[i]!= num){
                b[k]=a[i];
                k++;
            }
            i++;
        }
        System.out.println("After deleting "+num+ " from array new array is ");
        while (j<b.length) {
            System.out.println(b[j]+" ");
            j++;
        }

    }
}
