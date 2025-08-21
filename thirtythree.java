public class thirtythree
{
    public static void main(String[] args) {
        
        int x = -1;
        System.out.println(x << 1); // output is -2
    }
    
}
/* The value -1 is represented in binary as all 1s (1111 1111 in 8-bit 2's complement representation).
Shifting left by 1 results in -2 (binary 1111 1110).
The sign bit (leftmost bit) remains 1 for negative numbers, maintaining the number's sign.  */
