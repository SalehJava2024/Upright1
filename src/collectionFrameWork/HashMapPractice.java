package collectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {


    // "Given an array of integers, write a Java program to find how many times each number appears in the array.
    // Use a HashMap to store the frequency of each number and print the result."


    public static void findFrequency(){

        int[] numbers = {1, 2, 3, 2, 4, 3, 2, 1, 5, 3, 3, 4};

        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

for (int num:numbers){

frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);


}

System.out.println("number Frequency" + frequencyMap);


    }


    // "Given an array of integers, write a Java program to find how many times each number appears in the array.
    // Use a HashMap to store the frequency of each number and print the result.
    // " {1,3,3,4,8,11,11,113,123,54,34,13,33,33,33,1,3,8,}

    public static void frquencyNumFinder(){


        String sentence = "67676 Upright ^&^&&%& Tech &*&*&*676767 Solutions &*&*&*&";

        HashMap<Character,Integer>frequencyMap=new HashMap<>();

        for (char ch:sentence.toCharArray()){
            if (ch !=' '){
                frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
            }

        }
System.out.println(frequencyMap);

    }








    public static void main(String[] args) {

       // findFrequency();
        frquencyNumFinder();



    }







}
