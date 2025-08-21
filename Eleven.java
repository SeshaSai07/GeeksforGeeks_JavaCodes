// Java program to Illustrate Conversion of INteger and double to Byte

public class Eleven 
{
    public static void main(String[] args) 
    {
        byte b;
        int i = 257;
        double d = 322.142;

        System.out.println("Conversion of int to Byte.");

        b=(byte)i; // i%256

        System.out.println("i = " + i + ", b = " + b );
        System.out.println("Conversion of double to byte.");

        b=(byte)d; // d%256
        System.out.println("d = " + d + ", b= " + b);
        
        /* While assigning value to byte type the fractional part is lost and is reduced to modulo 256 (range of byte).  */
    }
}
