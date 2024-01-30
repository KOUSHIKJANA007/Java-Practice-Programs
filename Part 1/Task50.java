import java.util.Scanner;

public class Task50 {
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
        long sum=totalSumOfDiagonal(arr);
        System.out.println("Sum of two diagonal is: " + sum);
    }
    public static long totalSumOfDiagonal(int[][] arr){
        long firstDiagonal = firstDiaogonal(arr);
        long secondDiaogonal = secondDiaogonal(arr);
        long sum = firstDiagonal + secondDiaogonal;
        if(arr.length % 2 != 0){
            int index=arr.length/2;
            sum -=arr[index][index];
        }
        return sum;
    }

    public static long firstDiaogonal(int[][] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = i;
            sum = sum + arr[i][j];
            i++;
        }
        return sum;
    }
    public static long secondDiaogonal(int[][] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = arr[0].length-1-i;
            sum = sum + arr[i][j];
            i++;
        }
        return sum;
    }
}
