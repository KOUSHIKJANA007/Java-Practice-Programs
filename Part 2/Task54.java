import java.util.Scanner;

public class Task54 {
    boolean checkEvenOrOdd(int num){
       boolean f=num%2==0?true:false;
       return f;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number to check even or odd:");
            int num=sc.nextInt();
            Task54 task54=new Task54();
            if(task54.checkEvenOrOdd(num)){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}
