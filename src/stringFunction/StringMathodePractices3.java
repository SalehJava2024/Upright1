package stringFunction;

public class StringMathodePractices3 {

   public static void reverseString2(){

     String name = "Sami";
     for (int i=name.length()-1;i>=0; i--){

System.out.print(name.charAt(i));
     }


   }
public static void reverseString3(){
String name = "Madam";
 String rev ="";
    for (int i=name.length()-1;i>=0; i--) {
        rev = rev + name.charAt(i);
    }
    System.out.println(rev);

    if (name.equalsIgnoreCase(rev)){   //Palindrome

System.out.println("it is palindrome");

    }
    else {

        System.out.println("this is not Palindrome ");
    }

}

public static void reversePractice(){
    String name = "Nandos";
    for (int i=name.length()-1;i>=0;i--){

System.out.print(name.charAt(i));

    }

}

public static void reversePractice4(){
   String name= "ahmed.saleh0420@gmail.com";
   String rev ="";
    for (int i=name.length()-1;i>=0;i--){
      rev = rev+name.charAt(i);
    }
  System.out.print(rev);
}



    public static void main(String[] args) {
     //reverseString2();
       // reverseString3();
     // reversePractice();
        reversePractice4();


    }






}
