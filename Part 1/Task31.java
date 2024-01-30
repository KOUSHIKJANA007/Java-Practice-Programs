import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        System.out.println("Enter a digit:");
        Scanner sc=new Scanner(System.in);
        int digit = sc.nextInt();
        int res = sumOfDigits(digit);
        System.out.println("Sum of all digit of " + digit + " is: " + res);
    }
    
    public static int sumOfDigits(int digit){
        int sum=0;
        int n=0;
        while (digit !=0) {
            n = digit%10;
            sum += n;
            digit /=10;
        }
        return sum;
    }

}
