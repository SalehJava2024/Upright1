package staticKeyword;

import java.rmi.StubNotFoundException;

public class students {

  /* Static keyword cna be used before variable and methode.

  We use Static key word when Variable and methods are common for all objects.
   */

 String name;
 byte rollNumber;
 short regiNumber;
 short batch;
 byte id;
 static String location = "Uposohor Sylhet";
 static String schoolName = "Hollychild School and collage";

 public static void study(){
System.out.println("We do study");

 }

public void mentoring(){
System.out.println("we do mentoring regulerly");

}

    public static void main(String[] args) {

     students bbi = new students();
     bbi.name = "Jabed";
     System.out.println(bbi.name);
     bbi.rollNumber = 22;
     System.out.println(bbi.rollNumber);
     bbi.regiNumber = 342;
     System.out.println(bbi.regiNumber);
     bbi.id = 122;
     System.out.println(bbi.id);
     bbi.batch =9;
     System.out.println(bbi.batch);
     //bbi.location ="Uposohor Sylhet";
     System.out.println(location);
     //bbi.schoolName = "Hollychild School and collage ;
     System.out.println(schoolName);


     study();
     bbi.mentoring();

students bbj = new students();

        bbj.name = "Majed";
        System.out.println(bbj.name);
        bbj.rollNumber = 18;
        System.out.println(bbj.rollNumber);
        bbj.regiNumber = 42;
        System.out.println(bbj.regiNumber);
        bbj.id = 122;
        System.out.println(bbj.id);
        bbj.batch =9;
        System.out.println(bbj.batch);
        //bbj.location ="Uposohor Sylhet";
        System.out.println(location);
        //bbj.schoolName = "Hollychild School and collage ;
        System.out.println(schoolName);


        study();
        bbj.mentoring();


    }

}
