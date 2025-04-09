package collectionFrameWork;

public class FindingSumPractice {

/* Consider an array of the following numbers: 25, 26, 28, 29,30, 35
Print the sum of even numbers only for the array element
 */

    public static void sumfunder() {
        int[] numbers = {25, 26, 28, 29, 30, 35};
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even

                sum =sum+ num; // Add even number to sum
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }


    /* Consider an array of the following numbers: 25, 26, 28, 29,30, 35
Print the sum of even numbers only for the array element
 */
    public static void sumOfEvenNumber(){
        int[] numbers = {25,26,28,29,30,35};
        int sum = 0;
for (int num:numbers){
    if (num %2 ==0){
        sum+=num;
    }
}
        System.out.println("sum of even numbers " + sum);

    }





    public static void findSum2() {  // )Write a program to find the sum of 20-30


        int sum = 0;   //We initialize sum = 0 to store the total sum.

        for (int i = 20; i <= 30; i++) {     //We use a for loop to iterate through numbers 20 to 30.

            sum = sum+i;   // In each iteration, the number is added to sum.
        }

        System.out.println("Sum of numbers from 40 to 90 is: " + sum);  //Finally, we print the result.
    }


    // Write a program to find the sum of 20-30
    public static void sumFinder4(){

      int sum = 0;
for (int i=20; 20<=30;i++)

System.out.println("sum of 20 to 30 is " + sum);
    }





    public static void main(String[] args) {
       // sumfunder();
       // findSum2();
       sumOfEvenNumber();
        //sumFinder4();
    }



}
