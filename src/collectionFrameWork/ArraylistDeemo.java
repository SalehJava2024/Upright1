package collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDeemo {

  // Array is fixed /Static,  but Array list is not fixed its Dynamic.
  // List is a Interface but Arraylist is a class.
  // Arraylist allows duplicate value.


  public void listDemo(){

     // ArrayList<String> list1 = new ArrayList<>();  // You can Arraylist or List here.
      List<String> list1 = new ArrayList<>(); // this call Array Syntax
      System.out.println(list1.isEmpty());
      list1.add("Lexus");
      list1.add("Toyota");
      list1.add("Subaru");
      list1.add("Honda");
      list1.add("Acura");
      list1.add("Nissan");
      list1.add("Acura");
      list1.add("BMW");

      System.out.println(list1.isEmpty());

      System.out.println(list1.get(0));

      list1.remove(5);
System.out.println(list1);

     list1.add("Mercedez");
     System.out.println(list1);

     list1.add("Toyota");
     System.out.println(list1);

     for (int i=0; i<=list1.size()-1;i++){  // last step
     System.out.println(list1.get(i));

     System.out.println(list1.contains("Toyota")); // to check whether item exists use the contains() method


     }


     // Homework-- Create list of integer and add some values.

  }


    public static void main(String[] args) {

    ArraylistDeemo bbj = new ArraylistDeemo();
    bbj.listDemo();



    }






}
