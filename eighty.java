// first digit of a number

public class eighty 
{
    public static void main(String[] args)
    {
        int n = 123;
        System.out.println(printFirst(n));
    }

    public static int printFirst(int n) 
    {
        while (n >= 10) 
        {
            n = n / 10;
        }
        return n;
    }
    
}
