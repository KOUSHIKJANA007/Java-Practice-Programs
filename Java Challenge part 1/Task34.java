import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        checkPrime(a);
    }

    public static void checkPrime(int num) {
        int i = 2;
        if (num == 1) {
            System.out.println("not prime");
        }
        while (i < num) {
            if (num % i == 0) {
                System.out.println("not prime ");
                return;
            }
            i++;
        }
        System.out.println("prime");
    }
}
