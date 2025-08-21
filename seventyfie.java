// Passing parameters and returning results

public class seventyfie 
{
    public static void main(String[] args)
    {
        int x = 5, y = 10;
        System.out.println(getMax(x , y));
    }

    public static int getMax(int x, int y) 
    {
        if (x > y) 
        {
            return x;
        }
        else 
        {
            return y;

        }

    }
    
}
