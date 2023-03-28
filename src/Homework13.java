
porting scanner

import java.util.Scanner;

       //public class variables
public class Homework13
 {
    Scanner scanner = new Scanner(System.in); //to get input from the user

        public void Calculation()

      {

        System.out.println("Please enter your first number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter your second number: ");
        int b = scanner.nextInt();

        System.out.println("Please enter any symbol +,-,/,* :");
        String c = scanner.next();

        int d = a + b;
        int e = a - b;
        int f = a / b;
        int g = a * b;

        if (c.equals("+")) {
            System.out.println(+d);
        } else if (c.equals("-")) {
            System.out.println(+d);
        } else if (c.equals("/")) {
            System.out.println(+d);
        } else if (c.equals("*"))
            System.out.println(+d);
      }

    public static void main(String[] args) { //static main method

        Homework13 homework13 = new Homework13(); //adding  new object
        homework13.Calculation();
    }
 }