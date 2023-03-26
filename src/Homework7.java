
import java.util.Scanner;

public class Homework7 {
    Scanner scanner=new Scanner(System.in);

    public void Numbers (){

        System.out.println("Please enter first int number:");
        int a = scanner.nextInt();

        System.out.println("Please enter your second int number:");
        int b = scanner.nextInt();

        System.out.println("Please enter your third int :");
        int c= scanner.nextInt();

        System.out.println("Please enter your fourth int number:");
        int d= scanner.nextInt();

        System.out.println("Please enter your fifth int number:");
        int e = scanner.nextInt();

        int Total = a + b+c+d+e;
        double Average= Total/5.0;
        System.out.println("Your average is"+" " +Average);
    }
    public static void main(String []args){

        Homework7 homework7= new Homework7();// changing to static
        homework7.Numbers();
    }

    }
