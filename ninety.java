public class ninety 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1, 2, 3,
                       4 , 5 , 6}};
        for (int i = 0; i < arr.length; i++) // it will calculate the elements that are present in the array.
        {
            for (int j = 0; j < arr[i].length; j++) // it will calculate the individual column elements of the row in the array.
            System.out.print(arr[i][j] + " ");
        }
    }
}
