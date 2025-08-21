public class Twelve 
{
    public static void main(String[] args) 
    {
        int number1 = 789;
        double number2 = 789;
        boolean isValid = true;

        String text1 = String.valueOf(number1);
        String text2 = String.valueOf(number2);
        String text3 = String.valueOf(isValid);

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3); 
        
    }
    
}

// It is also possible to convert number and booleans to string and vice versa. To convert a value to string we can use the String.valueOf() function

