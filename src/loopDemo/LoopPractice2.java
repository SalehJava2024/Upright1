package loopDemo;

public class LoopPractice2 {


    public static void whileoop(){


      int a = 5;
      while (a<=10){

     //System.out.println(a);
     // a++;

      }

       int b =20;
      while (b>=8){
     //  System.out.println(b);
     //  b--;

      }


    }

  public static void forLoop () {

    for (int x=15; x>=4;x--){
System.out.println(x);
    }




  }

public static void dowhileLoop(){   // do while loop
int a = 6;
do {
    System.out.println(a);
    a--;
}
while (a>=9);


int b = 25;
do {
    System.out.println(b);
    b++;
}
while (b<=45);

}

public static void lShape() {
    for (int a = 10; a >= 1; a--) {

        System.out.println("Hello");
    }


}


public static void evenOdd() {
   for (int x=11; x<=30; x++) {
    if (x %2==0) {
        System.out.println(x +"even number");
    }

   }
  for (int x=11;x<=30;x++){
   if (x %2!=0){
       System.out.println(x + "is Odd number");
   }

  }


}


public static void main(String[] args) {


 dowhileLoop();
   // evenOdd();






}








}
