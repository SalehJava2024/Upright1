package arrayDemo;

import java.util.Arrays;

public class ArrayPractice {

public static void arrayDemo(){

String name[] = {"Majed","Sadik", "Sakib", "Abdul","Basit","Kader", "Zaber"};
int number[] = {21,12,33,4,15,6,37};

   // System.out.println(name.length);

    //name[3]="Hamid";

   Arrays.sort(name);
    for (int i=0; i<=number.length;i++){
      //System.out.println(name[i]);
    }





//Arrays.sort(number);
    for (int z=0;z<=number.length-1;z++){ //why lenth -1 for ??
    //System.out.println(number[z]);
    }


    String dogs[] ={"Tommy", "Max", "Alex","Jordan" ,"Lucifer" ,"Linkon"};


    Arrays.sort(dogs);
    for (int k=0; k<=dogs.length;k++){
        System.out.println(dogs[k]);

    }


}


    public static void main(String[] args) {

    arrayDemo();

    }








}
