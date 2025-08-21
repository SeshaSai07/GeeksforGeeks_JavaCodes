// Boolean operators

public class Twentyfour 
{ 
    public static void main(String[] args) {

        boolean a = true , b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);

        // short circuting
        //Short-circuiting skips the second condition if the first condition determines the result.

        int x = 10 , y = 5;
        if(x > 5 && y < 10) {
            System.out.println("Both conditions are true");
        }
    }

    
}
