// first digit of a number (Mathematical approach)

public class eightyone
{
    public static void main(String[] args) 
    {
        int n = 987;
        System.out.println(firstDigit(n));
    }

    public static int firstDigit(int n) {
        double power = Math.log10(n);
        int p = (int) power;
        int a = (int) Math.pow(10, p);
        int ans = n / a;
        return ans;
    }
    
}
