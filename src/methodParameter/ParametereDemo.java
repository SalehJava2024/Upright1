package methodParameter;

public class ParametereDemo {   //

public static void add (int a, int b){ //exp Parameter

    //int a = 30;
    //int b = 10;
    int c = a+b;
    System.out.println(c);

}

public void substract(){  //exp using object
   int d= 60;
   int e= 40;
   int f = d-e;
   System.out.println(f);

}

public static void multiplication(int m, int n){

 //int m = 500;
 //int n = 25;
 int p = m*n;
 System.out.println(p);


}

public static void devision(int x, int y){

  //int x = 500;
  //int y = 26;
  float z =(float)x/y;
  System.out.println(z);


}


    public static void main(String[] args) {
        ParametereDemo ddy = new ParametereDemo();

      add(20, 30);
      ddy.substract();
       ddy.multiplication(500,200);
      //  multiplication();
      // ddy.devision();
       devision(500, 26);



    }


}
