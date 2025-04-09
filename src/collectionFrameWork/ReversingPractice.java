package collectionFrameWork;

import java.util.Arrays;
import java.util.List;

public class ReversingPractice {

    public static void reverseSentence(){

    /*Suppose there is a string “This is a mentoring session” how to reverse only words --
     not the character.
     */


        // Step 1: Define the sentence inside the method
      String Sentence ="This is a mentoring session" ;



      // Step 2: Split sentence into words and store in a List
        List<String>reverseSentence = Arrays.asList(Sentence.split(""));

        System.out.println("Reversed Words: ");

        // Step 3: Use a loop to print words in reverse order

        for (int i =reverseSentence.size()-1;i>=0;i--){

            System.out.print(reverseSentence.get(i)); // Print words in reverse order



        }



    }



  public static void reverseNumber(){

       int number = 123456789; // Number to reverse
       int reverse = 0;


        while (number>0){

         reverse= reverse * 10 + (number%10); // Take last digit & add to reversed

          number = number/10; // Remove last digit

        }

System.out.println(reverse);

  }

public static void numberReverse2(){

 int number = 123456789;
 int rev = 0;

 while (number>0){

     rev= rev * 10+(number%10);
     number= number/10;
 }
 System.out.println(rev);
}


    public static void reverseSentence2(){

    // reverse "l "

String word = "Bangladesh";

List<String>revWord = Arrays.asList(word.split(""));

for (int i = revWord.size()-1; i>=0; i--){
    System.out.println(revWord.get(i));
}


    }





// word reversing using for while-loop only
public static void reveringSentence(){
    String word = "UprightTechSolution";
    String reversed = "";

    // Reverse the word using a for loop
    for (int i = word.length() - 1; i >= 0; i--) {
        reversed += word.charAt(i);
    }

    System.out.println(reversed);


}





    public static void main(String[] args) {
       //reverseSentence();
       // reverseNumber();
      // numberReverse2();
        //reverseSentence2();
        reveringSentence();
    }




}
