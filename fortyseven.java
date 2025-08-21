//Take a number n from user , print sum of first n natural numbers. if user enter -ve number , throw error and exit
import java.util.*;
public class fortyseven 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        if (num < 0) 
        {
            System.out.println("Invalid input");
            return;  
        }
        System.out.println(num * (num + 1) / 2);
        
    }
    
}
