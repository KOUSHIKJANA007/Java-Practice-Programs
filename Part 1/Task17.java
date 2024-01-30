import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number1:");
        num1=sc.nextInt();
        System.out.println("Enter a number2:");
        num2=sc.nextInt();
        System.out.println("Enter a number3:");
        num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1 +" is Greatest number");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 + " is Greatest number");
        }
        else{
            System.out.println(num3 + " is Greatest number");
        }
    }
}
