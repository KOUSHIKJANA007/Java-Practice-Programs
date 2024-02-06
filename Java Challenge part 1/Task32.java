import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first digit:");
        int a = sc.nextInt();
        System.out.println("Enter second digit:");
        int b = sc.nextInt();
        int res = lcm(a,b);
        System.out.println("Lcm of " + a +" and "+b+ " is: " + res);
    }
    public static int lcm(int a,int b){
        int i=1;
        while (true) {
            int factor=a*i;
            if(factor%b ==0){
                return factor;
            }
            i++;
        }
    }
}
