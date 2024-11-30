package variableDemo;

public class VariableAndMethodPractices {

    /*
    There are three parts of a variable
    i. Declare a variable == int age;
    ii.Define a variable== age = 25;
    iii. Use a Variable== System.out.println(age)

     * There are few types of Variable
     i. Instance Variable / object variable / Global Variable
     ii. Local Variable
     iii. Static Variable and Methode
     iv. Parameter


    there are two type of methode
    * main methode
    * Custom methode

     */
String name ;
int age;

 /*

 * Created by sami
 * This methode describe the height of the user

  */

    public void myActualheight(){ //custom methode
        float myHeight;
        myHeight = 6.1f;
        System.out.println(myHeight);

    }


    public static void main(String[] args) { // main methode
        String myName = "Sami";
        System.out.println(myName);
    }





}
