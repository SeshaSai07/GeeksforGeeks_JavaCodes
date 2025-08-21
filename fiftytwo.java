// Write a program to 5 pairs of integers from user for every pair(x , y) it shouls print (x / y) if y is not 0

import java.util.*;;
public class fiftytwo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++ ) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y == 0) {
                continue;
            }    
            System.out.println(x / y);
        
            }
        }
        
    }
    
