import java.util.Scanner;

public class Task69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check");
        String str=sc.nextLine();
        System.out.println("Given string is "+ (isPalindrome(str)?"palindrome":"not palindrome"));
    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPosition=str.length()-1;
        if (str.charAt(0)!=str.charAt(lastPosition)) {
            return false;
        }
        String newStr=str.substring(1, lastPosition);
        return isPalindrome(newStr);
    }
}
