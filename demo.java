package Software-ENG;
import java.util.Scanner;
import Software-ENG.saxophone;
public class demo 
{
    private saxophone sax1;
    public demo()
    {
        sax1 = new saxophone();
    }
    public void setSax1(saxophone v)
    {
        sax1 = v;
    }
    public saxophone getSax1()
    {
        return sax1;
    }
    public void foo(saxophone sax)
    {
        sax.makeSound();
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String instrument = input.nextLine();
        System.out.print("Select alto or tenor");
        if (instrument.equals("alto"))
        {
            alto altoSax = new alto();
            altoSax.sound();
        }
        else if (input.equals("tenor"))
        {
            tenor tenorSax = new tenor();
            tenorSax.sound();
        }
        else
        {
            System.out.print("You did not select one of the options");
            System.out.println("Random sound will be played");
            foo(sax1);
        }
    }
}
