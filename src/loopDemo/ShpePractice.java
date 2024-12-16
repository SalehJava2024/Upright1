package loopDemo;

public class ShpePractice {
    public static void shape(){
        for (int a=1;a<=25;a++){
            for (int b=1;b<=a;b++){
                System.out.print("*");

            }
            System.out.println();
        }
        for (int x=25; x>=1;x--){
            for (int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        shape();
    }



}
