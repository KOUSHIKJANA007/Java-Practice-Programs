import java.util.Scanner;

public class Task68 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter range to add all number");
            int count = sc.nextInt();
            System.out.print("Fibb serise is: ");
            for (int i = 1; i <= count; i++) {
                System.out.print(fibonaci(i) + " ");
            }
        }
        public static int fibonaci(int p){
            if(p==1){
                return 0;
            }
            if(p==2){
                return 1;
            }
            return fibonaci(p-1)+fibonaci(p-2);
        }
}
