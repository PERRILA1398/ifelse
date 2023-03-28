
//importing scanner
import java.util.Scanner;
 //public variables
public class Homework15
  {
      //create new scanner object
       Scanner scanner=new Scanner(System.in); //System.in to get input from the terminal

        public void Day()  //nonstatic method
    {

        System.out.println("Please enter any number from 1-7 to know their day name ");
        int a = scanner.nextInt(); //requesting input from user

        if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else if (a == 7) {
            System.out.println("Sunday");
        }
    }

        public static void main(String []args){

        Homework15 homework15= new Homework15();
        homework15.Day();
        }

    }