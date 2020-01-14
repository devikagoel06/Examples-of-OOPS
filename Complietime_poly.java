//Compile-time Polymorphism
package complietime_poly;
import java.lang.*;
class Calculate 
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
    static double add(int a,double b,int c)
    {
        return a+b+c;
    }
}

public class Complietime_poly {

   
    public static void main(String[] args) {
     System.out.println(Calculate.add(2,3));
     System.out.println(Calculate.add(2.5,3.6));
     System.out.println(Calculate.add(2,5.5,3));
     
     
     
     
     
    }
    
}
