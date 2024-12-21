package oopConcept.Polymorphism;

public class MethodeOverloading {



public void math(int a, int b){

System.out.println(a+b);

}

public void math(int a, int b, int c){

System.out.println(a+b-c);

}

    public void math(int a, int b, short c){

        System.out.println(a-b+c);

    }

    public static void main(String[] args) {
      MethodeOverloading bbj = new MethodeOverloading();
      bbj.math(20,30);
      bbj.math(30,50,55);
      bbj.math(40,20,60000);


    }





}
