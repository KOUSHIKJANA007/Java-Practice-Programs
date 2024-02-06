import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        System.out.println("Enter a number for sum of odd number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=summOfOddNumbers(num);
        System.out.println("Sum of all odd number from 1 to "+num+" is: "+res);
    }
    public static int summOfOddNumbers(int num){
        int sum=0;
        int i=1;
        while (i<=num) {
            if(i%2 != 0){
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
