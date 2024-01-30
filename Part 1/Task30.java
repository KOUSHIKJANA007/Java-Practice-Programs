import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        System.out.println("Enter a number for sum of odd number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=factorial(num);
        System.out.println("Factorial of "+num+" is: "+res);
    }

    public static int factorial(int n){
        int f=1;
        int i=1;
        if(n==0){
            return 0;
        }
        while (i<=n) {
            f *= i;
            i++;
        }
        return f;
    }
}
