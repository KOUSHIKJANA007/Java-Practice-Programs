import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        age=sc.nextInt();

        if(age>=60){
            System.out.println("Senior");
        }
        else if(age<60 && age>=20){
            System.out.println("Adult");
        }
        else if(age<20 && age>=13){
            System.out.println("Teen");
        }
        else{
            System.out.println("Child");
        }

    }
}
