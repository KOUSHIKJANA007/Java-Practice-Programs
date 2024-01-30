import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        isPalindrome(a);
    }

    public static void isPalindrome(int num){
        int temp=num;
        int rem;
        int reverse=0;
        while(temp !=0){
            rem=temp%10;
            reverse=reverse*10+rem;
            temp /=10;
        }
        if(reverse==num){
            System.out.println(num+" is a palindrome number");
        }
        else
        {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
