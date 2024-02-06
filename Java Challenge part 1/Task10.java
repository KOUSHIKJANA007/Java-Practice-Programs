import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        float length,width,perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        length=sc.nextFloat();
        System.out.println("Enter width:");
        width=sc.nextFloat();

        perimeter=2*(length+width);
        System.out.println("Perimeter of rectangle: "+perimeter);
    }
}
