// Explicit Conversion

public class Ten 
{
    public static void main(String[] args) 
    {
        /*char ch = 'c' ;
        int num = 88;
        ch = num; 
        error: incompatible types: possible lossy conversion from int to char
        ch = num;
        1 error*/ 

        double d = 100.04;
        // Explicit type casting by forcefully getting data frpm long datatype to integer type
        long l = (long)d;

        // Explicit type casting
        int i = (int)l;

        System.out.println("Double value: " + d);
        System.out.println("Long value: " + l); // here while printing the fractional part gets disappeared
        System.out.println("Int value: "+ i);

        
    }
}
