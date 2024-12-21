package finalKeyWord;

public class FinalDemoPersonalinfo {

// Final Key word can be used before class, before methode and before variable

// if i use final keyword before the class, the class can not be extended.
// if us final before the methode you cannot over ride it.

    //String ssn = "653-908406";

    final String ssn = "653-908406"; // if I use final before the variable i will not be able to change the value of variable.


  public void changeSsn(){  // if us final before the methode you cannot over ride it.

      System.out.println();
  }





    public static void main(String[] args) {
      FinalDemoPersonalinfo bbj = new FinalDemoPersonalinfo();
      //bbj.ssn = "561-908406";
      System.out.println(bbj.ssn);


    }





}
