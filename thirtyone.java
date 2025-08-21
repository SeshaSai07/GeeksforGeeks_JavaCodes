// bitwise left shift operator

public class thirtyone 
{
    public static void main(String[] args) 
    {
        int x = 3;

        System.out.println(x << 1); // output is 6

        System.out.println(x << 2); // output is 12
        
/*When 3 (binary 0000 0011) is shifted left by 1, the result is 6 (binary 0000 0110).
When shifted left by 2, the result is 12 (binary 0000 1100).
Each left shift effectively multiplies the value by 2.*/
    }
    
}
