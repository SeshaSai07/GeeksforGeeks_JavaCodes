// Check for Prime in Java
// Efficent method

public class sixtynine 
{
    public static void main(String[] args)
    {
        int n = 107;
        boolean prime = true;
        if (n == 1) 
        {
         prime = false;   
        }
        
        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0)
            prime = false;
        }
        System.out.println(prime);
    }   
}
// Time complexity: O(sqrt(n)) 
// Auxilary Space: O(1)