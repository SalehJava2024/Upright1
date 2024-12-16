package stringFunction;

public class StringMethodePractices2 {

    static String name = "Saleh Ahmed";
    static String courseName = "Java Selenium Automation Course";


public static void lenth(){

// Option 1.

  System.out.println(name.length());

// Option 2

  int namelenth =name.length();
  System.out.println(namelenth);

}

public static void retriveLetter(){
//Option 1
    System.out.println(name.charAt(1));

//option 2.
    char firsttletter = name.charAt(10);

    System.out.println(firsttletter);

}

public static void changeCase(){

String upperCase = name.toUpperCase();
System.out.println(upperCase);
String lowerCase = name.toLowerCase();
System.out.println(lowerCase);
System.out.println(name.toUpperCase());

}

public static void substringCourses(){
  String word = courseName.substring(5, 13);
  System.out.println(word);

}

public static void splittingString(){

    //String arrayCourse [] = courseName.split(" ");
   // System.out.println(arrayCourse.length);
  //  System.out.println(arrayCourse[0]);
   // System.out.println(arrayCourse[1]);
   // System.out.println(arrayCourse[2]);
    //System.out.println(arrayCourse[3]);

    String arraycourse2 [] = courseName.split("a");
    System.out.println(arraycourse2.length);
    System.out.println(arraycourse2[0]);
    System.out.println(arraycourse2[1]);
    System.out.println(arraycourse2[2]);
    System.out.println(arraycourse2[3]);
}

public static void replaceString(){
    String replace =courseName.replace(" ","_");
    System.out.println(replace);
System.out.println(courseName.replace(" ","_"));

}

public static void intoString(){

   int a= 100;
   //System.out.println(a+200);
   String newA = String.valueOf(a);
   System.out.println(newA+200);

}

public static void stringToint (){

    String a = "200";
    System.out.println(a+100);
    int newA = Integer.parseInt(a);
    System.out.println(newA+100);

}

public static void reverse(){
    StringBuffer sb = new StringBuffer(name);
    sb.reverse();
    System.out.println(sb);


}




    public static void main(String[] args) {
       // lenth();
       // retriveLetter();
       // changeCase
       // substringCourses();
      //  splittingString();
       // replaceString();
        //intoString();
       // stringToint();
        reverse();

    }




}
