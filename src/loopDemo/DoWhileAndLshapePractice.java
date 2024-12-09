package loopDemo;

public class DoWhileAndLshapePractice {


    public static void dowhile(){    // Practice ✅

        int a= 50;
    do {
        System.out.println(a);
        a--;
    }

while (a>=10);


    }

    public static void dowhile2(){

   int b =10;
   do {
       System.out.println(b);
       b++;
   }
   while (b<=30);


    }


   public static void lshape(){  // practice ✅

    for (int a=1; a<=10;a++){

    //System.out.println("Hello World");
    System.out.println(a+1);
    }

   }

/*

*
**
***
****
*****
******
*******
********
*********
**********

 */

public static void shape(){   // inc Home work ✅

  for (int x=1; x<=25;x++) {
   for (int y=1; y<=x; y++) {
       System.out.print("%");
   }
   System.out.println();

  }




 for (int a=25; a>=1;a--){       // Home work ✅
    for (int b=1; b<=a;b++){
        System.out.print("%");
    }
System.out.println();

 }


}





    public static void main(String[] args) {
      // dowhile();
      //  dowhile2();
       // lshape();
        shape();


    }




}
