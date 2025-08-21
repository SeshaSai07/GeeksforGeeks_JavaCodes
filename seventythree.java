public class seventythree 
{
    public static void main(String[] args)
    {
        System.out.println("Main Begins");
        fun1();
        System.out.println("Main ends");
    }

    public static void fun1() 
    {
        System.out.println("fun1() Begins");
        fun2();
        System.out.println("fun1() ends");
    }

    public static void fun2() 
    {
        System.out.println("Inside fun2()");
    }
    
}
