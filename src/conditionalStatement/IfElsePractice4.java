package conditionalStatement;

public class IfElsePractice4 {

    public void divicivilityCheck (int number){  //Write a program that checks if a number is divisible by 5, 3, or both.

       //int number =12;

       if (number % 5 ==0 && number % 3 ==0){
System.out.println("Divisible by 5 or 3");

       }

       else if (number %5 ==0) {
System.out.println("Divisible by 5");
       }

       else if (number %3==0) {
       System.out.println("Divisible by 3");
       }

       else {
      System.out.println("Not divisible by 5 or 3");

       }


    }


    public static void main(String[] args) {

    IfElsePractice4 bbj = new IfElsePractice4();
    bbj.divicivilityCheck(30);





    }













}
