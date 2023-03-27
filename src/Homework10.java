

import java.util.Objects;
import java.util.Scanner; // to import scanner in java


public class Homework10 {
    Scanner scanner = new Scanner(System.in); //to get input from the user

    public void City() {

        System.out.println("Please type any alphabet from a-f : ");
        String alpha = scanner.next();


        if (alpha.equals("a")) {
            System.out.println(" The name of the city is Agra ");

        } else if (alpha.equals("b")) {
            System.out.println(" The name of the city is Barcelona ");


        } else if (alpha.equals("c")) {
            System.out.println(" The name of the city is Chicago ");


        } else if (alpha.equals("d")) {
            System.out.println(" The name of the city is Dhaka ");

        } else if (alpha.equals("e")) {
            System.out.println(" The name of the city is Edinburgh ");

        } else if (alpha.equals("f")) {
            System.out.println(" The name of the city is Florida ");
        }else {
            System.out.println("Sorry given alphabets city name not available");
        }


    }

    public static void main (String []args){

        Homework10 homework10 = new Homework10 (); //new object
        homework10.City(); //static main method

    }
}

