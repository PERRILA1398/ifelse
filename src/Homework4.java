

import java.util.Scanner;

//public class
public class Homework4 {

    Scanner scanner = new Scanner (System.in); //input

    public void Results (){

        System.out.println("Please enter your Science grade:");
        int Science = scanner.nextInt();

        System.out.println("Please enter your Maths grade:");
        int Maths = scanner.nextInt();

        System.out.println("Please enter your English grade:");
        int English = scanner.nextInt();
        int Total = Science + Maths + English;
        double Average= Total/3.0;

        if (Average>=40 && Science >= 35 && Maths >=35 && English>=35) {
            System.out.println("Congratulations you have Passed");

        } else  {
            System.out.println(" Sorry you have failed the examination ");

        }


    }
    public static void main(String []args)
    {
        Homework4 homework4 =new Homework4 ();
        homework4.Results();
    }



}



