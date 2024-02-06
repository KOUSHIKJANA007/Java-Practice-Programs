import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int maxRows= sc.nextInt();
        // printFirstPattern(maxRows);
        // printSecondPattern(maxRows);
        printThirdPattern(maxRows);
    }
    public static void printFirstPattern(int maxRows){
        int i=0;
        while (i<maxRows) {
            int j=0;
            while (j<=i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void printSecondPattern(int maxRows){
        int i=maxRows;
        while (i>0) {
            int j=0;
            while (j<i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
    public static void printThirdPattern(int maxRows){
        int rows=maxRows;
        int i=rows;
        while (i>0) {
            int j=0;
            while (j<i-1) {
                System.out.print("   ");
                j++;
            }
            int k=rows;
            while (k>j) {
                System.out.print(" * ");
                k--;
            }
            System.out.println();
            i--;
        }
    }
}
