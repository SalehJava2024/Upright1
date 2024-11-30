package operators;

import java.util.Scanner;

public class RelationalOperator {

// > , < , >= , <= , == . !=   These will not return a value, it will only give true or false.

static int a= 20;
 static int b= 9;


    public static void relational(){  // for static result me this methode static

boolean result1 = a>b;
System.out.println(result1);

boolean result2 = a<b;
System.out.println(result2);

boolean result3 = a>=b;
System.out.println(result3);

boolean result4 = a<=b;
System.out.println(result4);

boolean result5 = a==b;
System.out.println(result5);

boolean result6 = a!=b;
System.out.println(result6);


    }




    public static void main(String[] args) {

RelationalOperator bbj = new RelationalOperator();

//bbj.relational();

relational();



    }







}
