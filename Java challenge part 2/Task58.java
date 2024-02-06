import java.util.Scanner;

public class Task58 {
    void calculator(int choice,int num1,int num2){
        switch (choice) {
            case 1:
                System.out.println("Addition of "+num1+" and "+num2+" is: "+(num1+num2));
                break;
            case 2:
                System.out.println("Sub of "+num1+" and "+num2+" is: "+(num1-num2));
                break;
            case 3:
                System.out.println("Multi of "+num1+" and "+num2+" is: "+(num1*num2));
                break;
            case 4:
                System.out.println("Division of "+num1+" and "+num2+" is: "+(num1/num2));
                break;
        
            default:
            System.out.println("enter valid choice");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is my simple calculator");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice in number :");
        int choice=sc.nextInt();
        System.out.println("Enter your first value for operation :");
        int num1=sc.nextInt();
        System.out.println("Enter your second value for operation :");
        int num2=sc.nextInt();
        Task58 task58=new Task58();
        task58.calculator(choice, num1, num2);
    }
}
