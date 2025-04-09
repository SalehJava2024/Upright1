package oopConcept.EncapsulationDemo;

public class Encap1 {

// As we already learned that Private Variable can not be used in other classes.
    // But we can use Private variable from other class by using ENCAPSULATION.


    private int sSn;


    public int getsSn() {
        return sSn;

    }


    public void setsSn(int sSn) {  // 6545762 we will set the SSn in created object is second class argument value for this parameter.
        this.sSn = sSn;
    }




}
