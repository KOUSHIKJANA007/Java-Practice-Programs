import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        float F,C;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        F=sc.nextFloat();
        C=(F-32)*((float)5/(float)9);
        System.out.println(C);
    }
}
