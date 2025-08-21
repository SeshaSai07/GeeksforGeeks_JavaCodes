// Reference behaviour of non-primitive datatypes
class Point 
{
    int x;
    int y;
    
}
public class five 
{
 public static void main(String[] args) 
 {
    Point p1 = new Point();
    p1.x = 10;
    p1.y = 20;

    Point p2 = p1; // both p1 and p2 point to the same object
    p2.x = 30;

    System.out.println("p1.x: " + p1.x);
    System.out.println("p2.x: " + p2.x);
 }   

}

/* p1 and p2 reference the same memory location.
Any modification made through p2 is reflected when accessing the object via p1. */