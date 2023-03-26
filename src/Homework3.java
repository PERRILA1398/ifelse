
 import java.util.Scanner;

public class Homework3 {
    Scanner scanner= new Scanner(System.in);

    //name roll no marks variables
  public void GradeStudents () {

      System.out.println("Please enter your Name:");
      String Name = scanner.nextLine();

      System.out.println("Please enter your Roll no:");
      int RollNo = scanner.nextInt();

      System.out.println("Please enter your Science grade:");
      int Science = scanner.nextInt();

      System.out.println("Please enter your Maths grade:");
      int Maths = scanner.nextInt();

      System.out.println("Please enter your English grade:");
      int English = scanner.nextInt();

      int Total = Science + Maths + English;
      System.out.println("Your Total Marks for the given grades are" + Total);


      double Average= Total/3.0;

      if (Average >= 80 && Average <= 100) {
          System.out.println("Your Grade is A+");

      } else if (Average >=60 && Average <= 80) {
          System.out.println("Your Grade is A");

      } else if (Average >= 50 && Average <= 60) {
          System.out.println("Your Grade is B");

      } else if (Average >= 35 && Average <= 50)
      {
          System.out.println("Your Grade is C");
      }else if (Average<=35){
          System.out.println(" Failed");
      }
  }
     public static void main (String []args)


    { Homework3 homework3= new Homework3();
        homework3. GradeStudents();

    }
  }
