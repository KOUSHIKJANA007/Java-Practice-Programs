import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        Task59 task59 = new Task59();

        do {
            System.out.println("Enter a password");
            pass = sc.nextLine();
        } while (!task59.checkPassword(pass));
        System.out.println("Thanks for enter valid password");

    }

    boolean checkPassword(String pass) {
        if (pass.length() >= 6) {
            return true;
        }
        return false;
    }
}
