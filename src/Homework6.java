
//importing scanner
import java.util.Scanner;

//nonstatic variables and method
public class Homework6
{
 Scanner scanner= new Scanner(System.in); //new object scanner

     public void Salary()
     {
        System.out.println("Please enter your employee id:");
     int a = scanner.nextInt(); //requesting input from the user

         System.out.println("Please enter your Name:");
     String b = scanner.next();

         System.out.println("Please enter your Basic Salary:");
         int c = scanner.nextInt();

    //formula to extract percentage
         int d = c*10/100; //percentage method
         System.out.println("Your HRA is:" +"£"+d);

         int e= c*8/100;
         System.out.println("Your DA is:" + "£"+e);

         int f= c*9/100;
         System.out.println("Your TA is:" +"£"+f);

         int g= c*20/100;
         System.out.println("Your PF is:" +"£"+e);

          int h= c+d+e+f-g;
         System.out.println("Your Gross Salary is:" +"£" +h);
     }

     //static main method
    public static void main(String []args)
    {
         Homework6 homework6= new Homework6();
         homework6.Salary();


    }



}
