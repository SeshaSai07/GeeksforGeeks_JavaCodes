public class ninetysix 
{
    public static void main(String[] args) 
    {
        int [] arr = {5, 6, 7, 8};
        // Call the function to find the maximum
        maximum(arr);
    }

    // Function to find the maximum value in the array
    public static void maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) 
            {
             max = arr[i];   
            }
        }
        System.out.print(max);
    } 
    
}
