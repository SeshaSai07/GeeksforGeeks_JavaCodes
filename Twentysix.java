// Precedence and associativity

public class Twentysix 
{
    public static void main(String[] args) {
        
        int a = 20 , b = 10 , /*c = 0*/  d = 20  , e = 40 , f = 30 ;
        
        //System.out.println("a + b / d = " + (a + b / d)); // output is 20

        // precedence rules for arithematic operators
        // ( * = / = %) > (+ - =)

        // if same precedence then associative rules are followed.
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)

        System.out.println("a + b * d - e / f = " + (a + b * d - e / f)); // output is 219

    }
    
}
