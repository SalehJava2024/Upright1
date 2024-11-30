package operators;

public class ArithmaticOperator {

// + , - , * , /

    public void arithmatic(){

int a = 14;
int b = 30;
int c = a+b;
int d = c;
int e = d;
System.out.println("14+30=" +c);
int f = b-a;
System.out.println("30-14=" +f);
int g = a*b;
System.out.println("14*30=" +g);
float h =(float) b/a;
System.out.println("30/14=" +h);

    }

    public static void newarithmatic (int a, int b){ // using Parameter

System.out.println(a+b);
System.out.println(b-a);
System.out.println(a*b);
//System.out.println(b/a);

    }
public static void divison(int b,int a){

    //float z = (float) b/a ;
    //System.out.println(z);

}

    public static void main(String[] args) {

       ArithmaticOperator bbj = new ArithmaticOperator(); //object

      //bbj.arithmatic(); // object variable

      newarithmatic(14,30); // Using parameter// () argument
      newarithmatic(17,34); // how do we crate decimal value using Parameter??
       // divison(30,14);





    }





}
