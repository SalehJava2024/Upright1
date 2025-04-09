package stringFunction;

public class stringPractice4 {

  public static void immutable(){     // = Unchangeable,, Mutable means = Changeable
  String name = "Fahad";
  String fullname = name.concat("Muhammed");
   //String fullname = name.concat(" Abdullah");
  System.out.println(fullname);


StringBuffer sb = new StringBuffer("Fahad");
 sb.append(" Muhammed");
 //sb.append(" Karim");
System.out.println(sb);
sb.insert(6,"Bin ");
System.out.println(sb);



  }

    public static void main(String[] args) {
        immutable();


    }





}
