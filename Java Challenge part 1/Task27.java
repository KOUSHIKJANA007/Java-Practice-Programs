import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check even or odd:");
        num=sc.nextInt();
        if((num & 1) == 1){
            System.out.println("Number is odd");
        }
        else
        {
            System.out.println("Number is even");
        }
    }
}
