import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Substraction:"+(a-b));
        System.out.println("Division:"+(a/b));
        System.out.println("Multi:"+(a*b));
        System.out.println("Module:"+(a%b));
    }
}
