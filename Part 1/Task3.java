public class Task3 {
    public static void main(String[] args) {


        int i,j,k;

        // Right half pyramid

        // for(i=0;i<5;i++){
        // System.out.println();
        // for ( j = i; j >=0; j--)
        // System.out.print(" * ");
        // }

        // Reverse Right half pyramid

        // for( i=0;i<5;i++){
        // System.out.println();
        // for ( j = 5; j >=i; j--)
        // System.out.print(" * ");
        // }

        // left half pyramid

        for ( i = 0; i < 5; i++) {
            
            for ( j = 4; j > i; j--) {
                System.out.print("   ");

            }
            for ( k = i+1; k > 0; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}
