package oopConcep.tInheritance;

public class InheritanceDemo3 extends InheritanceDemo2 {

    String session;




    public static void main(String[] args) {
        InheritanceDemo3 bbj3 = new InheritanceDemo3();
        bbj3.fruitname = "Apple";
        System.out.println(bbj3.fruitname);
        bbj3.vitamine = 'C';
        System.out.println("Viamine " + bbj3.vitamine);
        bbj3.price = 400;
        System.out.println(bbj3.price);
        bbj3.session = "Summer";
        System.out.println(bbj3.session);
       // bbj3.graden();
        bbj3.sellingTheGarden();

    }



}
