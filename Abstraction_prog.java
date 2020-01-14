//Abstraction
package abstraction_prog;
import java.lang.*;
abstract class Game
{
    abstract void playGame();
}
class Cricket extends Game
{
    void playGame()
    {
        System.out.println("Playing Cricket");
    }
}
class Badminton extends Game
{
    void playGame()
    {
      System.out.println("Playing Badminton");  
    }
}
public class Abstraction_prog {

    
    public static void main(String[] args) {
      Game g=new Cricket();
      g.playGame();
    }
    
}
