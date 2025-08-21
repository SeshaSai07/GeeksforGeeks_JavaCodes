// unsigned right shift

// In Java, the operator '>>>' denotes unsigned right shift operator and always fill 0 irrespective of the sign of the number.

public class thirtyfive 
{
    public static void main(String[] args)
    {
        int x = -1;

        System.out.println(x >>> 29); // output = 7

        System.out.println(x >>> 30); // output = 3

        System.out.println(x >>> 31); // output = 1
        
    }
    
}

/*
Initial Value (x = -1):
Binary representation of -1 (32-bit): 11111111111111111111111111111111.

Right Shift by 29 Positions (x >>> 29):
Resulting binary: 00000000000000000000000000000111 (last 3 bits remain).
Decimal value: 7.

Right Shift by 30 Positions (x >>> 30):
Resulting binary: 00000000000000000000000000000011 (last 2 bits remain).
Decimal value: 3.

Right Shift by 31 Positions (x >>> 31):
Resulting binary: 00000000000000000000000000000001 (last 1 bit remains).
Decimal value: 1.
 */
