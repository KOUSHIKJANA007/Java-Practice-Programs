import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number :");
        int num=sc.nextInt();
        Task62 task62=new Task62();
        if(task62.isPrime(num)){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
    }
    boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
