package conditionalStatement;

public class IfElsePractices3 {


    //static int day = 1;

    public static void aWeek(int day){

      //int day = 9;

     if (day==1){
     System.out.println("Monday");
     }
     else if (day==2) {
       System.out.println("Tuesday");
     }
     else if (day==3) {
         System.out.println("Wednesday");
     }

     else if (day==4) {
     System.out.println("Thursday");
     }
     else if (day==5) {
      System.out.println("Friday");
     }
     else if (day==6) {
     System.out.println("Saturday");
     }
     else if (day==7) {
       System.out.println("Sunday");
     }

     else {

         System.out.println("Invalid input");
     }

    }


    public static void main(String[] args) {

        //IfElsePractices3 bbj = new IfElsePractices3();
        aWeek(5);



    }















}
