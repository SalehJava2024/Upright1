package oopConcep.tInheritance;

public class InheritanceDemo2 extends InheritanceDemo{


int price;

    public void sellingTheGarden(){
        super.graden();  // Garden is coming from super parent class .
        System.out.println("Sell the Garden");

    }



    public static void main(String[] args) {
InheritanceDemo2 bbj2 =new InheritanceDemo2();
bbj2.price = 300;
System.out.println(bbj2.price);
bbj2.fruitname="Banana";
System.out.println(bbj2.fruitname);
bbj2.vitamine= 'A';
System.out.println(bbj2.vitamine);
//bbj2.graden();
bbj2.sellingTheGarden();






    }







}
