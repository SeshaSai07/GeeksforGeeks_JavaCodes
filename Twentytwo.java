public class Twentytwo 
{
    public static void main(String[] args) 
    {
        int x = 10 , y = 5;

        x = y;
        System.out.println("Agter assignment: " + x);

        x += y;
        System.out.println("After addition assignment: " + x);

        x -= y;
        System.out.println("After Subtraction assignment: " + x);

        x *= y;
        System.out.println("After Multiplication assignment: " + x);

        x /= y;
        System.out.println("After Division assignment: " + x);

        x %= y;
        System.out.println("After modulo assignment: " + x);
        
    }
    
}
