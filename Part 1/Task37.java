import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        isArmstrong(a);
    }
    public static int power(int x,int y){
        int res=1;
        while (y!=0) {
            res=res*x;
            y--;
        }
        
        return res;
    }

    public static int digitCount(int num){
        int count=0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    
    
    public static void isArmstrong(int num){
        int count=digitCount(num);
        int sum=0;
        int temp=num;
        int rem;
       
        while (temp != 0) {
            rem=temp%10;
            sum=sum+power(rem, count);
            temp /=10;
        }
        if(sum==num){
            System.out.println(num+ " is Armstrong number");
        }
        else{
            System.out.println(num + " is not Armstrong number");
        }
    }
}
