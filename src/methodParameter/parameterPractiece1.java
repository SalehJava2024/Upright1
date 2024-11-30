package methodParameter;

public class parameterPractiece1 {

    public void add (int a, int b){

     int c = a+b;
     System.out.println(c);


    }

    public static void substract (int d, int e){

        int f= d-e;
        System.out.println(f);

    }

    public void multiply(int o,int p){
        int q= o*p;
        System.out.println(q);

    }


    public static void division(int x, int y){

       float z=(float) x/y;
       System.out.println(z);


    }


    public static void main(String[] args) {

      parameterPractiece1 bbj=new parameterPractiece1();
      bbj.add(30,40);
      substract(120,90);
      bbj.multiply(300, 400);
      division(112,80);




    }




}
