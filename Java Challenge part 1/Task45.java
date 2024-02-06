import java.util.Scanner;

public class Task45 {
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
        int[] b = reverseArray(a);
        System.out.println("Reverse array:");
        while (j < b.length) {
            System.out.print(b[j] + " ");
            j++;
        }
    }

    public static int[] reverseArray(int[] a) {
        int i = 0;
        while (i < a.length / 2) {
            int swap = a[i];
            a[i] = a[(a.length - 1) - i];
            a[(a.length - 1) - i] = swap;
            i++;
        }
        return a;
    }
}
