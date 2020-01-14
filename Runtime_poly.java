//Runtime Polymorphism
package runtime_poly;
import java.lang.*;

class Person{
    public void display()
    {
        System.out.println("In Person class ");
    }
}
class Student extends Person {
    public void display()
    {
        System.out.println("In Student class");
    }
}
class Employee extends Person {
    public void display()
    {
        System.out.println("In Employee class");
    }
}
public class Runtime_poly {

    
    public static void main(String[] args) {
       Person p=new Person();
       Student s=new Student();
       Employee e=new Employee();
       Person ref;
       ref=p;
       ref.display(); //calls display method of Parent class 
       
       ref=s;
       ref.display(); //calls display method of Student class
       
       ref=e;
       e.display(); //calls display method of Employee class
    }
    
}
