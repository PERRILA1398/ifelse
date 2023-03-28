
//importing scanner

import java.util.Scanner;


public class Homework8 //nonstatic variables and method
 {

    Scanner scanner= new Scanner(System.in); //new scanner object

    public void Positive()  //nonstatic method
    {

        System.out.println("Please input any number: ");
        int a= scanner.nextInt(); //requesting input from user

        if ( a> 0){
            System.out.println("Positive");


        }else if (a<0){

            System.out.println("Negative");
        }else if (a==0);
         System.out.println("Zero");

    }

    //static main method
    public static void main(String []args)
    {
        Homework8 homework8= new Homework8();
        homework8.Positive();




    }

 }
