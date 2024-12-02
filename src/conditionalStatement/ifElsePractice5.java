package conditionalStatement;

public class ifElsePractice5 {


    public static void leapYearCheck(){

   int year = 2023;

   if ((year %4 ==0 && year %100 !=0) || (year %400 ==0)    ){

System.out.println("Its a leap Year");

   }

   else {
   System.out.println("its not a leap Year");

   }



    }


    public static void main(String[] args) {


       leapYearCheck();


    }




}
