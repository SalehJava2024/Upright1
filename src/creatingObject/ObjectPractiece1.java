package creatingObject;

public class ObjectPractiece1 {


    String fishname;
    int fishAge;
    String fishcolor;
    float fishSize;

    public void swim(){

     System.out.println("fish can swim");

    }

    public static void jumping(){

        System.out.println("this fish really can jump ");

    }

    public static void main(String[] args) {

      ObjectPractiece1 bbj=new ObjectPractiece1();
      bbj.fishname="Salmon";
      System.out.println(bbj.fishname);
      bbj.swim();
      jumping();
      bbj.fishSize=5.4f;
      System.out.println(bbj.fishSize);



    }




}
