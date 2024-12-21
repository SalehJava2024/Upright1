package oopConcept.Polymorphism.Overriding;

public class Dogs extends Animal {


    /**
     * Cretaed by Sami for overriding demo purposes
      * @param sound
     */



@Override
    public void sound(String sound){
//String sound = "this is barking that means it is a";
System.out.println(sound +" Dog");

    }


    public static void main(String[] args) {

      Dogs obj = new Dogs();
      obj.sound("this is barking that means it is a");



    }




}
