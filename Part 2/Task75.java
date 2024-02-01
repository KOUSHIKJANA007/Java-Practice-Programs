import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        String[] a = new String[size];
        System.out.println("Enter few names");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            builder.append(a[i]).append(" ");
        }
        System.out.println(builder);
    }
}
