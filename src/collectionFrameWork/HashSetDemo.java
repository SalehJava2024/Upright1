package collectionFrameWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void demoSet(){

        HashSet<String>color = new HashSet<>(); // no matter how many times you enter HashSet will only allow show it one time

//Hashset does not allow duplicate element
        color.add("Black");
        color.add("Black");
        color.add("Black");
        color.add("Black");
        color.add("Black");
        color.add("Black");
        color.add("Black");
        color.add("Black");
        color.add("Black");

        System.out.println(color);


color.add("White");
color.add("Blue");

System.out.println(color);

System.out.println(color.contains("Green"));

color.remove("Blue");

System.out.println(color);
System.out.println(color.contains("Blue"));

color.add("red");
color.add("Orange");




    }


    public static void duplicate (){

        int[] numbers ={1, 2, 3, 4, 4, 5, 6,6,6,6,6,6,6,10,11,12,13,13};


        Set<Integer> uniqueNumber = new HashSet<>();

        for (int num : numbers) {

            uniqueNumber.add(num);

        }

System.out.println("This are the Unique numbers "+ uniqueNumber);

    }


    public static void uniqueFinder(){

    int [] numbers = {1,3,3,4,8,11,11,113,123,54,34,13,33,33,33,1,3,8,};

    Set<Integer>uniqueNumber = new HashSet<>();

    for (int num: numbers){

      uniqueNumber.add(num);
    }
System.out.println("unique number is " + uniqueNumber);
    }



    public static void uniquename(){

      String [] names = {"Akash", "majed", "majed","Salam", "Bikash", "Saber", "salam"};

      Set<String>uniqueName= new HashSet<>();
      for (String nam:names){

          uniqueName.add(nam.toLowerCase());
      }

System.out.println(uniqueName);

    }









    public static void main(String[] args) {

         // demoSet();
        //duplicate();
        //uniqueFinder();
        //uniquename();




    }




}
