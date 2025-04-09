package oopConcept.InterfaceDemo;

public class BankOfAmerica implements InterfacePractice {


    @Override
    public void replaceOrder() {
        System.out.println(name);
        System.out.println(cardNumber);
        System.out.println(billingAddress);
        System.out.println(expDate);
        System.out.println(ccv);

        System.out.println("Place order");
    }

    @Override
    public void reduceAmount() {

        System.out.println("Reduce $$ Amount");

    }


    public static void main(String[] args) {

   BankOfAmerica bbj = new BankOfAmerica();
   bbj.replaceOrder();
   bbj.reduceAmount();


    }


}
