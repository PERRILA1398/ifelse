
import java.util.Scanner; //importing scanner

//public class variables
       public class Homework11
  {

    Scanner scanner=new Scanner(System.in);//create new scanner //System.in to get input from the terminal

    public void Vote() //nonstatic method
       {
           System.out.println("Please enter your age: ");
           int a = scanner.nextInt(); //requesting input from user

           if(a >=18)
           {
            System.out.println("You are eligible to vote");
           }else

           {
               System.out.println("Sorry you are not eligible to vote");
           }


      }

        public static void main (String []args)  //static main method
        {
        Homework11 homework11= new Homework11();
        homework11.Vote();

        }
  }
