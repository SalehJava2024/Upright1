package collectionFrameWork;

import java.util.Arrays;
import java.util.List;

public class PalindromePractice {


    public static void palindrome(){


        String word = "kayak";
        String rev = new StringBuilder(word).reverse().toString();

        if (word.equals(rev)){
            System.out.println("it is palindrome ");
        }
else {
    System.out.println("it is not palindrome");
        }
    }


    public static void numberReversing(){

       String word = "Kayak";

      String rev = new StringBuilder(word).reverse().toString();

      if (word.equalsIgnoreCase(rev)){
          System.out.println(rev + " is palindrome ");
      }

      else {
          System.out.println(rev + "is not palindrome");
      }
    }



    public static void reverseSentence2(){
        String word = "kayak";
        String reversed = "";

        // Reverse the word using a for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
System.out.println("Reeversed of Kayak " +reversed);


        // Check if original and reversed words are the same
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a palindrome.");
        }
        else {
            System.out.println(word + " is not a palindrome.");
        }


    }






    public static void main(String[] args) {
       // palindrome();
       // numberReversing();
        reverseSentence2();
    }


}
