package loopDemo;

public class LooppPracticeHomeWork {


    public static void hW2 (int number){  //2.Write a program that prints the multiplication table of a given number using a for loop.

        for (int a=1;a<=10;a++){
        System.out.println(number+ "X"+a+ "=" +(number*a));

        }

    }



public static void hW3(){     //3.Write a program to reverse the digits of a given integer using a while loop.




}


public static void hW4(){    //Write a function and create a loop inside it from 20-50 and find which number is divisible by 7

for (int a=20; a<=50;a++){
  if (a %7==0){
      System.out.println(a + " Divisible by 7");
  }
  else if (a %7!=0) {
   System.out.println(a+ " not Divisible by 7");
  }

}












}













    public static void main(String[] args) {
        //hW2(5);
      // hW3();
        hW4();
    }




}
