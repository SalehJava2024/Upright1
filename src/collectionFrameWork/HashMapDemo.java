package collectionFrameWork;

import java.util.HashMap;

public class HashMapDemo {

    public static void countNumber(){

      /* Given an array of integers, write a Java program to find how
        many times each number appears in the array 11,12,11,13,14,14 ,14,14,14,15,16,18   */


        int [] numbers ={11,12,13,13,13,14,15,16,17,18,18,18,18,18,19,19,19,20};

        HashMap<Integer,Integer> numberFrequency = new HashMap<>();


        for (int num:numbers){
            numberFrequency.put(num,numberFrequency.getOrDefault(num,0)+1);
        }

        System.out.println("Number frequency "+ numberFrequency);



    }




public static void nameCount(){

    // Local array of names
    String[] names = {"Saleh", "Majed", "Ali", "Saleh", "Kashem", "Masura", "Mahia", "Liza", "Mahia"};

    // Creating a HashMap to store name frequencies
    HashMap<String, Integer> frequencyMap = new HashMap<>();

    // Iterating through the array and counting occurrences
    for (String name : names) {
        frequencyMap.put(name, frequencyMap.getOrDefault(name, 0) + 1);
    }

    // Printing the frequency of each name
    System.out.println("Name Frequencies: " + frequencyMap);

}

public static void wordCount(){

        //Let take your first name “uprigttechsolutions”.
    // Write a program that print the occurrences of the each characters



    String text = "uprigttechsolutions";

    // Step 2: Create a HashMap to store character frequencies
    HashMap<Character, Integer> frequencyMap = new HashMap<>();

    // Step 3: Loop through each character and count occurrences
    for (char ch : text.toCharArray()) {
        frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
    }

    // Step 4: Print the character frequencies
    System.out.println("Character Frequencies: " + frequencyMap);

}



    public static void correcter(){

/* Question 13: Let Say there is a String “Hello Please Write a
Java Program” … So how many characters are there without space?
 */

        String text = "Hello Please Write a Java Program";

        // Step 2: Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Step 3: Loop through each character and count occurrences
        for (char ch : text.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1); // Fix: Use +1 instead of -1
            }
        }

        // Step 4: Print the character frequencies
        System.out.println("Character Frequencies: " + frequencyMap);

    }


    public static void main(String[] args) {


  //  countNumber();
       // nameCount();

        wordCount();

//correcter();

    }






}
