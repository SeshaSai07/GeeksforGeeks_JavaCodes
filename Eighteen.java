public class Eighteen 
{
    public static void main(String[] args) 
    {
      int x = 100;
      float z = (float) Math.PI;

      System.out.println(x);
      
      //Displays PI upto 2 decimal places
      System.out.format("Value of PI: %.2f\n", z);
    
      //Displays PI with a width of 5
      System.out.format("Value of PI: %5.2f\n" , z);

      //Pads with leading zeroes
      System.out.format("Value of PI: %05.2f\n" , z);

    }
    
}
