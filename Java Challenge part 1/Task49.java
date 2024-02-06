import java.util.Scanner;

public class Task49 {
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
        System.out.println("sum is : "+sumOfAllElements(arr));
        System.out.println("avarege is : "+averageOfAllElements(arr));
    }
    public static int sumOfAllElements(int[][] arr){
        int i=0;
        int sum=0;
        while (i<arr.length) {
            int j=0;
            while (j<arr[0].length) {
                sum=sum+arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double averageOfAllElements(int[][] arr){
        double rows=arr.length;
        double cols=arr.length;
        double av=sumOfAllElements(arr)/(rows*cols);

        return av;
    }
}
