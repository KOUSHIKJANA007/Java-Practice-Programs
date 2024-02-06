import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        float P,t,R,compoundIntarest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter P:");
        P=sc.nextFloat();
        System.out.println("Enter T");
        t=sc.nextFloat();
        System.out.println("Enter R");
        R=sc.nextFloat();

        compoundIntarest=P*(1+R/100)*t;

        System.out.println(compoundIntarest);
    }
}
