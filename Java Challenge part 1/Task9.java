import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        float a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextFloat();
        System.out.println("Enter second number:");
        b=sc.nextFloat();

        System.out.println("Product of "+a+" and "+b+"is:"+(a*b));
    }
}
