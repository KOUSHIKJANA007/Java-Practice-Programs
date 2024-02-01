import java.util.Scanner;

public class Task55 {
    int findAbsolute(int num){
       int value= num<0? -num:num;
       return value;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number to make absolute value:");
            int num=sc.nextInt();
            Task55 task55=new Task55();
            int ab=task55.findAbsolute(num);
            System.out.println("Absolute value of "+num+" is : "+ab);
        }
    }
}
