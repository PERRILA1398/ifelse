import java.util.Scanner; //importing scanner


public class Homework14
   {
    Scanner scanner = new Scanner(System.in); //to get input from the user


    public void Anything() //nonstatic method
       {


          System.out.println("Please enter any input from alphabet, number or symbol");
           char ch = scanner.next().charAt(0); //requesting input

             if ( ch>='a' && ch <= 'z')
           {System.out.println("It is a small alphabet");

           } else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a number");

           } else if( ch>='A' && ch <= 'Z') {
            System.out.println("It is a alphabet");

           } else  {
            System.out.println("It is an symbol");
           }


        }

        //static main method
      public static void main(String []args){

        Homework14 homework14 = new Homework14(); //new object
        homework14.Anything();
      }
    }

