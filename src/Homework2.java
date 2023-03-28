
import java.util.Scanner; // importing scanner

//public class variables
public class Homework2
{

    //new scanner object
    Scanner scanner = new Scanner(System.in);


    //nonstatic method and variables
    public void LeapYear()
    {

        System.out.println("Please enter the year in int value");
        int year = scanner.nextInt(); //requesting input from user

        //leap year formula
        if (year%4==0)

        {
            System.out.println("It is a leap year");
        } else {
            System.out.println("Specified year is not a leap year");

        }


    }

    //changing to static and main method
    public static void main(String[] args)
    {
      Homework2 homework2 = new Homework2();
      homework2.LeapYear();

    }
}








