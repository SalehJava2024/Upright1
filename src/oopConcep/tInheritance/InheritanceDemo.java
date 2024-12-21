package oopConcep.tInheritance;

public class InheritanceDemo {

    /* There are few type of Inheritance
    1: Single inheritance
    2: Multi level inheritance
    3: Heirachieal inheritance. // Class B extends class A, Class C also class A , Father and two son relation
    //Multiple Inheritance is not possible
     */


String fruitname;
char vitamine;


public void graden(){
    System.out.println("Fruits Garden");
}


    public static void main(String[] args) {
        InheritanceDemo bbj = new InheritanceDemo();
        bbj.fruitname = "Orange";
        bbj.vitamine = 'C';
    }






}
