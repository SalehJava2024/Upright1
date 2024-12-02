package conditionalStatement;

public class IfelsePrctice2 {

static int score = 65; // using static and global variable.

public static void gradeCalculate(){  // you can also do this by creating parameter EXP (int score)

  // int score = 25; // using local variable

  if (score <=25){
  System.out.println("Your score is F");

  }

  else if (score>= 25 && score <= 45) {
     System.out.println("your grade is E");
  }
  else if (score >= 46 && score <=50) {
     System.out.println("your Grade is D");
  }

  else if (score >= 51 && score <=60) {
     System.out.println("your Grade is C");
  }

  else if (score >= 61 && score <= 80) {
    System.out.println("Your Grade is B");
  }
  else if (score > 80) {
  System.out.println("Your Grade is A");
  }

  else {
  System.out.println("Invalid input");

  }

}







    public static void main(String[] args) {
    IfelsePrctice2 bbj = new IfelsePrctice2();

   // bbj.gradeCalculate(35);
        gradeCalculate();


    }





}
