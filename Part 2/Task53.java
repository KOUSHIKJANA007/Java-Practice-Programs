import java.util.Scanner;

public class Task53 {
    int findMinimum(int num1,int num2){
        int min=num1<num2 ? num1:num2;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        Task53 task53=new Task53();
        int min=task53.findMinimum(num1,num2);
        System.out.println("minimum= "+min);
    }
}
