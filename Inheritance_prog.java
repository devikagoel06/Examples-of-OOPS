//Inheritance in Java
package inheritance_prog;
import java.lang.*;
class Books
{
    int page_num;
    String book_name,author_name;
    float price;
    public Books()
    {
        page_num=200;
        book_name="Pride and Prejudice";
        author_name="Jane Austen";
        price=250;
    }
    public void display()
    {
        System.out.println("The name of the book is "+ book_name);
        System.out.println("The price of the book is "+ price);
        System.out.println("The author name is  "+ author_name);
        System.out.println("The total number of pages is "+ page_num);
        
    }
}
class PaperBooks extends Books
{
    int shipping_charges=20;
    public void displayinfo()
    {
        display();
        System.out.println("The total shipping charges are "+ shipping_charges);
    }
}
public class Inheritance_prog {

    
    public static void main(String[] args) {
       PaperBooks pb=new PaperBooks();
       pb.displayinfo();
    }
    
}
