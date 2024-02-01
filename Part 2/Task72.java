import java.util.Scanner;

public class Task72 {
    double areaOfCircle(double r){
        return Math.PI*r*r;
    }
    double circumferenceOfCircle(double r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r=sc.nextInt();
        Task72 task72=new Task72();
        System.out.println("Area of circle:"+task72.areaOfCircle(r));
        System.out.println("Circumference of circle:"+task72.circumferenceOfCircle(r));
    }
}
