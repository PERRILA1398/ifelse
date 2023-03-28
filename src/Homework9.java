

//importing scanner
import java.util.Scanner;

//public class variables
public class Homework9

 {

    //importing scanner in to the system below to place input from the user
    Scanner scanner = new Scanner(System.in);

    //nonstatic method and variables
    public void Sales()
    {

        System.out.println("Please type in your int sales id: ");
        int a = scanner.nextInt(); //requesting input

        System.out.println("Please type in your name: ");
        String b = scanner.next();

        System.out.println("Please type in your sales amount in percentage: ");
        int c = scanner.nextInt();

        System.out.println("Please type in your basic salary: ");
        int d = scanner.nextInt();

        int e = d * c / 100; //percentage formula


          if (c >= 35 && c <= 20)     {

            System.out.println("Your commission for this month is:" + " £" + e);
        } else if (c >= 20 && c <= 10) {
            System.out.println("Your commission for this month is:" + " £" + e);
        } else if (c >= 10 && c <= 5)  {
            System.out.println("Your commission for this month is:" + " £" + e);
        } else if (c >= 5)             {
            System.out.println("Your commission for this month is:" + " £" + e);
        } else if (c <= 5)             {
            System.out.println("Sorry you have failed to reach the target this month:" + "£" + e);
        }
    }

        public static void main(String []args)
       {
        Homework9 homework9 = new Homework9 (); //new object
        homework9.Sales(); //static main method

       }

}


