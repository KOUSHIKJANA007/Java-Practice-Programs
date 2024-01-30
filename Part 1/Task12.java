import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        float P,T,R,Intarest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter P:");
        P=sc.nextFloat();
        System.out.println("Enter T");
        T=sc.nextFloat();
        System.out.println("Enter R");
        R=sc.nextFloat();

        Intarest=(P*T*R)/100;
        System.out.println("Interst is "+Intarest);
    }
}
