// Methods with Object References

class Point {int x , y;} // non - primitive datatype
public class seventyseven 
{
    public static void main(String[] args) 
    {
        Point p = new Point();
        p.x = 5;
        p.y = 10;
        fun(p);
        System.out.println(p.x + " "+p.y);
    }
    public static void fun(Point p) 
    {
        p.x = 10;
        p.y = 10;
    }
}
//output will be 10, 10
// When objects are passed as arguments, changes made inside the method affect the original object.
//This example shows how methods can modify the state of objects passed as arguments.