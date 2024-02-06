import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        System.out.println("Before swapping A= " + a + " B=" + b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping A= "+a+" B="+ b);
    }
}
