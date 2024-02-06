import java.util.Scanner;

public class NumberGaussing74 {
    int createRandom() {
        return (int) Math.floor(Math.random() * 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        NumberGaussing74 gauss = new NumberGaussing74();
        int actualNumber = gauss.createRandom();
        do {
            System.out.println("Gauss a number from 1-10");
            int Gauss = sc.nextInt();
            if(Gauss<0){
                System.out.println("Enter positive number");
                break;
            }
            if(Gauss < actualNumber){
                System.out.println("Your gauss is smaller than actual number");
            }
            else if(Gauss>actualNumber){
                System.out.println("Your gauss is bigger than actual number");
            }
            else{
                System.out.println("Congratulations you successfully gauss the number");
            }

            System.out.println("Enter 1 to gauss anothor number");
            choice = sc.nextInt();
        } while (choice == 1);
    }
}
