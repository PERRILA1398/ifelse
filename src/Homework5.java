
import java.util.Scanner;

public class Homework5 {

    Scanner scanner = new Scanner(System.in);

    public void Interchange() {

        System.out.println("Please enter your int Number1:");
        int a = scanner.nextInt();

        System.out.println("Please print your int Number2");
                int b = scanner.nextInt();

                //adding new variable
           int c=a;
           a=b;
           b=c;


     System.out.println("After interchanging their values are" +a+" and "+b);





    }
    public static void main(String []args){
        Homework5 homework5 = new Homework5();
        homework5.Interchange ();

    }
}
