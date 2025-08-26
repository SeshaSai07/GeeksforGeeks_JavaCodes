public class ninetyseven 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 6, 7, 8, 9};
        sumofArray(arr);
    }

    public static void sumofArray(int[] arr) {
        int sum = 0;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // print total sum
        System.out.print(sum);
    }
    
}
