package oopConcept.AbstractDemo;

public class Dog extends Animal {


    @Override
    public void sound() {
System.out.println("Dog barks");
    }

    @Override
    public void move() {
System.out.println("it can run very fast");
    }

    @Override
    public void food() {
     System.out.println("Meat and dog foods");
    }


    public static void main(String[] args) {

    Dog bbj = new Dog();

    bbj.sound();
    bbj.move();
    bbj.food();
    bbj.residence();






    }







}
