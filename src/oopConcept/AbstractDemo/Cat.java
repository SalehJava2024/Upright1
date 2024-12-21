package oopConcept.AbstractDemo;

public class Cat extends Animal{


    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void move() {
System.out.println("Walk, Run and Climb tress");
    }

    @Override
    public void food() {
System.out.println("Loves Fish");
    }


    public static void main(String[] args) {

     Cat bbj = new Cat();

     bbj.sound();
     bbj.move();
     bbj.food();
     bbj.residence();


    }





}
