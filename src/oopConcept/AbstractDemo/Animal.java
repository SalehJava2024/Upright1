package oopConcept.AbstractDemo;

public abstract class Animal {

  /* TA ABSTRACTION -- Hiding some information and showing what necessary/functionality .
this process can be achieved by using Abstraction class or Interface.DA


ABSTRACT actually is a keyword that can be used before class and Method.  THIS A NON ACCESS MODIFIER KIND.

 when it is a ABSTRACT class you can not instantiate the class. ( means you can not crate a object of this class)

 When it is a Abstract methode there will be no body of the methode. and the body should be provided by the extended Child class.

   */

  String animalName;
   public abstract void sound();   // this is an Abstract methode.

   public abstract void move ();

   public abstract void food();


   public void residence(){     // this is a regular methode.

System.out.println("is a domestic pet ");
   }


    public static void main(String[] args) {

       // it will not allow to create an Object/instantiate .



    }


















}
