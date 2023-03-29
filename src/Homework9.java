

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

        int e= d*c/100;
          if (c >= 35 && c<=20 )     {

            System.out.println("Your sales commission for this month is:"  + "£" +e);
        } else if (c >= 30000 && c <= 50000) {
            System.out.println("Your sales commission for this month is:"  + "£"+ e );
        } else if (c >= 20000 && c <= 30000)  {
            System.out.println("Your sales  commission for this month is:"  + "£"+e);
        } else if (c >= 10000 && c<= 20000 )             {
            System.out.println("Your sales commission for this month is:" + "£"+ e);
        } else if (c <= 10000)             {
            System.out.println("Your sales commission for this month is:" + "£"+ e) ;
        }
    }

        public static void main(String []args)
       {
        Homework9 homework9 = new Homework9 (); //new object
        homework9.Sales(); //static main method

       }

}


