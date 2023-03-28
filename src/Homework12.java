
//importing scanner
import java.util.Scanner;

public class Homework12 {
    //create new scanner object
    Scanner scanner = new Scanner(System.in);    // System.in to get input from the terminal

    public void Change() { //nonstatic method and variables


        System.out.println("Please enter any alphabet in Uppercase");
        String alphabet = scanner.next(); //requesting input

        System.out.println(alphabet.toLowerCase()); //changing input to lowercase

    }


    public static void main(String[] args) //static main method
    {
        Homework12 homework12 = new Homework12(); //static method
        homework12.Change();

    }

}