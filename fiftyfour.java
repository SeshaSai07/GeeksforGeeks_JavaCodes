public class fiftyfour 
{
    public static void main(String[] args) {
        long n = 34567893;
        int count = 0;
        while (n > 0) 
        {
            n = n / 10;
            count = count + 1;
        }
        System.out.println(count);
    }
    
}
