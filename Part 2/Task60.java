import java.util.Scanner;

public class Task60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int gauss;
        int num=5;
        do {
            System.out.println("Guass a number");
            gauss = sc.nextInt();
        } while (num != gauss);
        System.out.println("You successfully gauss the number");
    }
}
