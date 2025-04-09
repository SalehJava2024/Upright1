package collectionFrameWork;

public class JavaPractice {

    public static void divicibilityCheck () {
        for (int num = 20; num <= 30; num++) {
            if (num % 7 == 0) {
                System.out.println(num + " is divisible by 7.");
            }

            else if (num %7 !=0){
              System.out.println(num+ "not divisible by 7");
            }
        }


    }


        public static void checkDivisibility() {
            int num = 15; // Defined inside method, no parameters

            if (num % 3 == 0 && num % 5 == 0){
                System.out.println(num + " is divisible by both 3 and 5.");}

            else if (num % 3 == 0){
                System.out.println(num + " is divisible by 3.");}

            else if (num % 5 == 0){
                System.out.println(num + " is divisible by 5.");}

            else{
                System.out.println(num + " is not divisible by 3 or 5.");}
        }










        public static void main(String[] args) {
       divicibilityCheck();
       // numberDivicibility();
            //checkDivisibility();
    }

}
