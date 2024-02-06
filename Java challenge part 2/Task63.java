import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        Task63 task63=new Task63();
        System.out.println("Maximum= "+ task63.findMax(a));
    }
    int findMax(int[] a){
        int max=Integer.MIN_VALUE;
        for(int i:a){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
