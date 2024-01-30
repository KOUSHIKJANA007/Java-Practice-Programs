import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in percentage:");
        marks=sc.nextInt();

        if(marks>=90){
            System.out.println("A");
        }
        else if(marks>=75 && marks<90){
            System.out.println("B");
        }
        else if(marks>=60 && marks<75 ){
            System.out.println("C");
        }
        else if(marks>=30 && marks<60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
