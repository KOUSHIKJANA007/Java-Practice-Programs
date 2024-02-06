import java.util.Scanner;

public class Task66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to add all number");
        int range = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < range; i++) {
            System.out.println("Enter number to add");
            int num = sc.nextInt();
            if(num<0){
                continue;
            }
            sum += num;
            System.out.println("Added....");
        }
        System.out.println("addition is: "+sum);
    }
}
