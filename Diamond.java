import java.util.Scanner;

public class Diamond {

    //  generating the diamond pattern
    public static void generateDiamond(int height) {
        
        for (int i = 1; i <= height; i++) {
            
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Printing numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Printing numbers in decreasing order
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

           
            System.out.println();
        }

        // for decresing numbers
        for (int i = height - 1; i >= 1; i--) {
           
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Printing numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Printing numbers in decreasing order
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the height of the diamond: ");
        int height = scanner.nextInt();

        generateDiamond(height);

        
        scanner.close();
    }
}

