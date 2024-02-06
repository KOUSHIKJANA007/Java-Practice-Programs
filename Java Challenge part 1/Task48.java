import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size of x:");
        int x = sc.nextInt();
        System.out.print("enter array size of y:");
        int y = sc.nextInt();
        System.out.print("Enter array elements:");
        int[][] arr = new int[x][y];
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[0].length) {
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("enter number for search");
        int num = sc.nextInt();
        boolean res = search(arr, num);
        if (res) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }

    public static boolean search(int[][] arr, int num) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[0].length) {
                if (arr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
