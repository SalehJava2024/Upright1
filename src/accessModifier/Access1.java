package accessModifier;

public class Access1 {

/* There are few types of access modifier :
1. Public --- any public properties or methods can be accessible through the project.
2. Private --- any Private properties or methods can accessible only in its own class.
3.No Access-- Package Private -- any properties or methods can be accessible through its own Package
4.Protected--- any protected properties and methods can be accessible from other package with extension.
 */

 public int hour = 24;    // You can access this variable from any package and class.
private int minute = 60; // this private method You can only access it from this class
 String day = "Saturday"; // can be used in any class of the current package.
 protected int week = 7; // Can be used from any package by extending its class

 public int printHour(){   // you can use same method for Minute, day and week
 int myHour = hour;
  return myHour;
 }




 public static void main(String[] args) {

  Access1 bbj = new Access1();
  System.out.println(bbj.minute);
  //System.out.println(bbj.hour);
  System.out.println(bbj.printHour());

 }


}
