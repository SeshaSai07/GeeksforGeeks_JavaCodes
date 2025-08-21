// Passing Objects by Reference vs. Reassigning Objects
class Point {int x , y;}
public class seventyeigth 
{
 public static void main(String[] args) {
        // Creating a Point object
        Point p = new Point();

        // Assigning values to the coordinates
        p.x = 5;
        p.y = 10;

        // Calling the fun method and passing the Point
        // object
        fun(p);

        // Printing the unchanged coordinates of p
        System.out.println(p.x + " " + p.y);
    }

    public static void fun(Point p) {
        // Creating a new Point object
        p = new Point();

        // Modifying the new Point object
        p.x = 10;
        p.y = 10;
    }
}
//output is 5, 10
//If an object reference is reassigned inside a method, it does not affect the original object.
//In this case, the original object remains unchanged because the reassignment inside fun() only affects the local reference.