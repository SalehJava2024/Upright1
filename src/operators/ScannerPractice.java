package operators;

import java.util.Scanner;

public class ScannerPractice {

    // int a=20;
    // b = 9;
    // c = 12;


    public static void scaning (){


       Scanner scan = new Scanner(System.in);

       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();


        boolean result1 = (a>b)&&(b>c);
        System.out.println(result1);
        boolean result2 = (a<b)&&(b==c);
        System.out.println(result2);
        boolean result3 = (a<b)||(b<c);
        System.out.println(result3);
        boolean result4 = (a==b)||(b!=c);
        System.out.println(result4);
        boolean result5= (a!=b)&&(b>=c);
        System.out.println(result5);





    }


    public static void main(String[] args) {
        scaning();

      Scanner scan = new Scanner(System.in);
       String myname = scan.nextLine();
       System.out.println("my name is " +myname);
      // int myage = scan.nextInt();
       //System.out.println("my age is " +myage);
      // int myYearofborn = scan.nextInt();
      // System.out.println("I was bor in" +myYearofborn);




    }











}
