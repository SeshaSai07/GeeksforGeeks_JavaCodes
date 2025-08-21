// user defined class example

class Point 
{
    int x;
    int y;
}
public class four
{
    public static void main(String[] args) 
    {
        //creating an object for the class
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        System.out.println("Point coordinates: " + p.x + " , " + p.y);
    }
}

/* A Point class is defined with two fields: x and y.
An object of Point is created using new.
The values of x and y are assigned and accessed using the object reference p */