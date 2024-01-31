import java.util.Scanner;

public class Task67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to add all number");
        int range = sc.nextInt();
        System.out.print("Even numbers are:");
        for(int i=1;i<=range;i++){
            if (i%2==0) {
                System.out.print(i+" ");
            }
            else{
                continue;
            }
        }
    }
}
