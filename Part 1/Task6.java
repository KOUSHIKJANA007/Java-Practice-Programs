import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        a=sc.nextInt();
        System.out.print("Enter second number:");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum of "+a+" and "+b+ " is: "+c );
    }
}
