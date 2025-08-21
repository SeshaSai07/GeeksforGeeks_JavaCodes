// Check for Prime in Java 
// Naive Method

public class sixtyeight 
{
    public static void main(String[] args) 
    {
        int n = 11;
        boolean prime = true;
        if (n <= 1) 
        prime = false;
        else {
            // check from 2 to n - 1
            for (int i = 2; i < n; i++) 
            if(n % i == 0)
                prime = false;
        }
        if (prime) 
        {
         System.out.println("True");   
        }
        else {
            System.out.println("False");
        }
    }
    
}

//Time complexity: O(n) 
//Auxilary Space: O(1)