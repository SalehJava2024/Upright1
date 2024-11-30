package operators;

import java.util.Scanner;

public class LogicalOperator {

    // and or  and ,, and (&&), or (||) -- this is also returning true/ false .

   // int a = 20;
 //   int b = 9;
  //  int c = 12;

public void logical(){

    Scanner scan = new Scanner(System.in);  //Scanning
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

    LogicalOperator obj = new LogicalOperator();
    //obj.logical();

        Scanner scan = new Scanner(System.in);

       //String myname= scan.nextLine();
       //System.out.println("my name is " +myname);
      //int myage = scan.nextInt();
       // System.out.println("myCurrent Age" + myage);
       // short myRegi = scan.nextShort();
     //   System.out.println(myRegi);
       //float myStock= scan.nextFloat();
     //  System.out.println(myStock);


        // else if lession:

        String veg = "pomato";
        if (veg=="tomato"){

 System.out.println("bring it home");

        }

       else  {

System.out.println("bring something else");

        }







    }











}
