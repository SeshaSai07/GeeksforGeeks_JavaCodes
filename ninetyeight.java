public class ninetyeight 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40};
        double avg = average(arr);
        System.out.println(avg);
    }

    public static double average(int[] arr) 
    {
        int sum = 0;

        // calculate the sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // calculate the average
        double avg = (double) sum / arr.length;
        return avg;
    }
    
}
