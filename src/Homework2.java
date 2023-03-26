
import java.util.Scanner;


public class Homework2
{

    Scanner scanner = new Scanner(System.in);

    public void LeapYear() {
        System.out.println("Please enter the year in int value");
        int year = scanner.nextInt();

        if (year%4==0)

        {
            System.out.println("It is a leap year");
        } else {
            System.out.println("Specified year is not a leap year");

        }


    }

    public static void main(String[] args)
    {
      Homework2 homework2 = new Homework2();
      homework2.LeapYear();

    }
}








