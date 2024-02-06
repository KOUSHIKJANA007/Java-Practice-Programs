import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[] a = new int[size];
        int i = 0, j = 0;
        System.out.println("enter array elements");
        while (i < a.length) {
            a[i] = sc.nextInt();
            i++;
        }
        if (isPalindrome(a)) {
            System.out.println("Array is palindrome");
        } else {
            System.out.println("Array is not palindrome");

        }
    }

    public static boolean isPalindrome(int[] a) {
        int i = 0;
        while (i < a.length) {
            if (a[i] != a[(a.length - 1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
