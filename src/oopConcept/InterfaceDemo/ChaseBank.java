package oopConcept.InterfaceDemo;

public class ChaseBank implements InterfacePractice{


    @Override
    public void replaceOrder() {

      System.out.println(name);
        System.out.println(cardNumber);
        System.out.println(billingAddress);
        System.out.println(expDate);
        System.out.println(ccv);

        System.out.println("Place order Please");


    }



    @Override
    public void reduceAmount() {

       System.out.println("Reduce amount");




    }

    public static void main(String[] args) {

       ChaseBank bbj = new ChaseBank();
       bbj.replaceOrder();
       bbj.reduceAmount();


    }



}
