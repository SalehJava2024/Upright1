package conditionalStatement;

public class IfElseStatement {

//static int age = 40;  // Using Static

public  void ifElse(){  // crating object
   int age= 20;

    if (age==10){
System.out.println("age is 10");
    }
    else if (age==15){

        System.out.println("age is 15");
    }

    else if (age==20){
   System.out.println("age is 20");
    }

    else {
        System.out.println("none of the above is true");
    }
}


    public static void main(String[] args) {

    IfElseStatement bbj = new IfElseStatement();

    bbj.ifElse();

   // ifElse();


    }




}
