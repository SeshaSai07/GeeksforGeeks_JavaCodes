// Check whether the array is sorted or not

public class ninetyfour 
{
    public static void main(String[] args) 
    {
        int[] a = {6 , 9 , 30, 4 , 50};

        int n = a.length;

        // check if the array is sorted
        boolean ans = isSorted(a , n);

        if (ans == true) 
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
    }

    // function to check whether the array is sorted or not

    public static boolean isSorted(int[] a, int n)
    {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) 
            {
                return false;
                
            }
        }
        return true;
    }
    
}
