package collectionFrameWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class JavaInterviewPeactices {


    public static void main (String[]args){

       int number = 19;

       if (number %3==0 && number %5==0){
           System.out.println(number + " is divisible by both");
       }
       else if (number %3==0) {
         System.out.println(number + " is divisible by 3");
       }
       else if (number %5==0) {
           System.out.println(number + " is divisible by 5");
       }

       else {
           System.out.println(number +" number is not divisible none"); 
       }
    }









}
