import java.util.*;
public class sixtytwo 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        // outer loop for rows

        while (i <= n) 
        {
            int j = 1;

        // loop for spaces

        while (j <= (n - i)) 
        {
            System.out.print("  ");
            j++;
        }

        // loop for stars

        while (j <= n) 
        {
            System.out.print("* ");
            j++;
        }
            
        // Move to the next Line
        i++;
        System.out.println();

        }
        
    }
    
}
