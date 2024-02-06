import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        float base,height,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base:");
        base=sc.nextFloat();
        System.out.println("Enter height");
        height=sc.nextFloat();

        area=((float)1/(float)2)*base*height;
        System.out.println("Area of tringle: "+area);
    }
}
