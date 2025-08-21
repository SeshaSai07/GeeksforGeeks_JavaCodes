// Fibonacci series

public class seventyone 
{
    public static void main(String[] args) 
    {
        int n = 9;
        int a = 0, b = 1;

        if (n == 1) 
        {
            System.out.print(a);
        }
        else if (n == 2) 
        {
            System.out.print(a + " " + b);
            
        }
        else {
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
    
}
