import java.util.*;
public class sixtyone 
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read input from user

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print star on left edge
            System.out.print("*");

            // Print space in between (only if row > 1 and not last row)
            if (i > 1 && i < n) {
                for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
                    System.out.print(" ");
                }
                // Print star on right edge
                System.out.print("*");
            }

            // For the last row, print all stars
            if (i == n) {
                for (int j = 1; j < n; j++) {
                    System.out.print(" *");
                }
            }

            System.out.println(); // Move to the next line
        }

        sc.close();
    }
    
}
