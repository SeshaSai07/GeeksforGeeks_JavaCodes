import java.util.*;
public class sixtythree 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) 
        {
            int j = 1;
            while (j <= (n - i)) // loop for spaces
            {
                System.out.print(" ");
                j++;
                
            }
            int k = 1;

            while (k <= (2 * i - 1))  // loop for stars
            {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    
}
