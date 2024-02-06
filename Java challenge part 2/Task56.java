import java.util.Scanner;

public class Task56 {
    void catagorized(int score){
        String cat=score>=80? "High":score>=50?"Moderate":"low";
        System.out.println(cat);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter score for catagorized:");
        int num=sc.nextInt();
        Task56 task56=new Task56();
        task56.catagorized(num);
    }
}
