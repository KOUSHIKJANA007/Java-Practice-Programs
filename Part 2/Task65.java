import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter array elements");
            String a=sc.nextLine();
            if(a.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("Exit from loop");
    }
}
