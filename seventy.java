// Check for Prime in Java
// More Efficient Code(for large numbers)

public class seventy 
{
    public static void main(String[] args) 
    {
        int n = 1031;
        boolean prime = true;

        if (n == 1)
        prime = false;

        if (n == 2 || n == 3)
        prime = true;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) 
            {
             prime = false;   
            }
        }
        System.out.println(prime);
    }
}
