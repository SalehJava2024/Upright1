package stringFunction;

public class stringPractice4 {

  public static void immutable(){     // = Unchangeable,, Mutable means = Changeable
  String name = "Suleman";
  String fullname = name.concat("Muhammed");
  System.out.println(name);
StringBuffer sb = new StringBuffer("Suleman");
sb.append(" Muhammed");
System.out.println(sb);
sb.insert(8,"Bin ");
System.out.println(sb);
  }

    public static void main(String[] args) {
        immutable();


    }





}
