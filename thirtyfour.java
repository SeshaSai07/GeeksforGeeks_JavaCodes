// Right shift operators

public class thirtyfour 
{
    public static void main(String[] args) {
        
        int x = -4;
        System.out.println(x >> 1);

        int y = 4;
        System.out.println(y >> 1);
    }
}
/*Negative Number (x = -4):
Binary representation of -4 (in 8-bit, 2's complement): 11111100.
When shifted right by 1: 11111110 (sign bit 1 is preserved).
Decimal value: -2. */

/*
Positive Number (y = 4):
Binary representation of 4 (in 8-bit): 00000100.
When shifted right by 1: 00000010.
Decimal value: 2.
 */