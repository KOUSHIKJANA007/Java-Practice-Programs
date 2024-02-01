import java.util.Scanner;

public class Task71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=sc.next();
        System.out.println("Enter second string");
        String str2=sc.next();
        String res=str1.concat(" ").concat(str2);
        System.out.println("After concatination string is "+res.toUpperCase());
    }
}
