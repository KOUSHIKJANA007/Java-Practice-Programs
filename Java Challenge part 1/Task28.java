import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        System.out.println("Enter a number for make multi table:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        multiTable(num);
    }
    public static void multiTable(int num){
        int i=1;
        while (i<=10) {
            System.out.println(num+" x "+i+" = "+(num*i));
            i++;
        }
    }
}
