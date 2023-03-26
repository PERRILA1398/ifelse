

import java.util.Scanner;


public class Homework8 {

    Scanner scanner= new Scanner(System.in);

    public void Positive(){

        System.out.println("Please input any number: ");
        int a= scanner.nextInt();

        if ( a> 0){
            System.out.println("Positive");


        }else if (a<0){

            System.out.println("Negative");
        }else if (a==0);
         System.out.println("Zero");

    }

    public static void main(String []args){
        Homework8 homework8= new Homework8();
        homework8.Positive();




    }
}
