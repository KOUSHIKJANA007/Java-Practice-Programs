import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number");
        int num=sc.nextInt();
        Task64 task64=new Task64();
        int rs=task64.checkOcurrence(a, num);
        System.out.println("Ocurrence of "+num+" in array is: "+rs);
    }
    
    int checkOcurrence(int[] a,int num){
        int c=0;
        for(int i:a){
            if(i==num){
                c++;
            }
        }
        return c;
    }
}
