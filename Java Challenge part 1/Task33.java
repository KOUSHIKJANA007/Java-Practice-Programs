import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first digit:");
        int a = sc.nextInt();
        System.out.println("Enter second digit:");
        int b = sc.nextInt();
        int res = gcd(a,b);
        System.out.println("GCD of " + a +" and "+b+ " is: " + res);
    }

    public static int small(int a,int b){
        if(a<b){
            return a;
        }
        else
        {
            return b;
        }
    }

    public static int gcd(int a,int b){
        int i=1;
        int s=small(a, b);
        int result=0;
        while (i<=s) {
            if(a%i==0 && b%i==0){
                result=i;
            }
            i++;
        }
        return result;
    }
}
