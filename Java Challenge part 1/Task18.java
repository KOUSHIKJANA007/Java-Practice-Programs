import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        year=sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0 && year%100==0){
            System.out.println("leap year");
        }else{System.out.println(" not leap year");}
        
    }
}
