//String Comparison

public class Twenty
{
    public static void main(String[] args) 
    {
        String str1 = "hello";
        // String str2 = "hello";
        String str3 = "Hello";

        // equals
        /*boolean result1 = str1.equals(str2);
        boolean result2 = str1.equals(str3);*/

        //equalsIgnoreCase()
        boolean result = str1.equalsIgnoreCase(str3);
        System.out.println(result); // returns true

        /*System.out.println(result1); // returns true
        System.out.println(result2); // returns false*/
        
    }
    
}
