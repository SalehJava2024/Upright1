package stringFunction;

public class StringMethodeClass1 {

   static String name = "Saleh Ahmed";

    public static void lenth(){

      //option 1:

      System.out.println(name.length());

      // Option 2:
        int nameLenth = name.length();
        System.out.println(nameLenth);



    }


public static void retrieveLetter(){

   //option 1:
    System.out.println(name.charAt(0));

    //option 2:

char firtsletter = name.charAt(0);
System.out.println(firtsletter);
}


    public static void main(String[] args) {

        lenth();
        retrieveLetter();

    }






}
