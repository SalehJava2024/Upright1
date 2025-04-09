package collectionFrameWork;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice1 {


public void numberDemo(){

    List<Integer> number1 = new ArrayList<>();  // For Integer data type type Integer full word instead or int, only int will give error.

    number1.add(20);
    number1.add(30);
    number1.add(40);
    number1.add(50);
    number1.add(60);
    number1.add(70);
    number1.add(80);
    number1.add(90);

    System.out.println(number1);

    number1.add(95);
    System.out.println(number1);

    number1.remove(6);
    System.out.println(number1);


    number1.add(70);
    System.out.println(number1);  // ArrayList allows duplicate value.

    for (int a=0; a<=number1.size()-1;a++){

       System.out.println(number1.get(a));

    }


}


    public static void reverseWords() {
        // Step 1: Define the sentence inside the method
        String sentence = "This is a mentoring session";

        // Step 2: Split sentence into words and store in a List
        List<String> words = Arrays.asList(sentence.split(" "));

        // Step 3: Use a loop to print words in reverse order
        System.out.print("Reversed Words: ");
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.print(words.get(i) + " "); // Print words in reverse order
        }
    }










    public static void main(String[] args) {

    ArrayListPractice1 bbj = new ArrayListPractice1();
    //bbj.numberDemo();

        reverseWords();

    }





}
