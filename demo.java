package Software-ENG;
import java.util.Scanner;
import Software-ENG.saxophone;
public class demo 
{
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
        }
    }
}
