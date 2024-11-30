package creatingObject;

public class Birds {

String birdNames;    // all of them are global variable
String birdKind;
String birdColour;
String bidOrigin;
int birdAge;
char birdGender;
Float birdSize;
float birdflyingTime;


public void singing(){
    System.out.println("bird can sing");
}

public void fly(){
   System.out.println("bird Can fly in the Sky");
}

public  void pettingHabit(){
   System.out.println("Bird Can be pet ");

}

public  void walkingBird(){
 System.out.println(" Bird can walk on the ground ");

}

public void singingMelody(){
  System.out.println("this bird all can say Ka Ka ka");


}

    // Object of birds should always be created inside the main methode
    // ClassName ReferenceVariable = New ClassName
    public static void main(String[] args) {

            Birds blueBird = new Birds(); // ClassName ReferenceVariable = New ClassName
            blueBird.birdNames = "Bluie";
            System.out.println(blueBird.birdNames);
            blueBird.birdAge = 2;
            System.out.println(blueBird.birdAge);
            blueBird.birdSize = 3.21f;
            System.out.println(blueBird.birdSize);
            blueBird.birdGender = 'f';
            System.out.println(blueBird.birdGender);
            blueBird.birdColour = "Blue";
            System.out.println(blueBird.birdColour);
            blueBird.birdKind = "Parrot";
            System.out.println(blueBird.birdKind);

            blueBird.fly();
            blueBird.singing();
            blueBird.pettingHabit();

            //creating another object

            Birds YelloBirds = new Birds(); // ClassName ReferenceVariable = New ClassName
            YelloBirds.birdNames = "Yelda";
            System.out.println(YelloBirds.birdNames);
            YelloBirds.birdKind = "Maccaow";
            System.out.println(YelloBirds.birdKind);
            YelloBirds.birdGender = 'M';
            System.out.println(YelloBirds.birdGender);
            YelloBirds.birdColour = "YeelloRed";
            System.out.println(YelloBirds.birdColour);
            YelloBirds.birdAge = 5;
            System.out.println(YelloBirds.birdAge);
            YelloBirds.birdSize = 2.34f;
            System.out.println(YelloBirds.birdSize);

            YelloBirds.singing();
            YelloBirds.fly();
            YelloBirds.pettingHabit();
            YelloBirds.walkingBird();




            Birds blackBird = new Birds();
            blackBird.birdNames = "Crow";
            System.out.println(blackBird.birdNames);
            blackBird.birdKind = "Black Crow";
            System.out.println(blackBird.birdKind);
            blackBird.birdAge = 4;
            System.out.println(blackBird.birdAge);
            blackBird.bidOrigin = "Bangladesh";
            System.out.println(blackBird.bidOrigin);
            blackBird.birdflyingTime = 3.54f;
            System.out.println(blackBird.birdflyingTime);




            blackBird.fly();
            blackBird.walkingBird();
            blackBird.pettingHabit();
            blackBird.singingMelody();


    }







}
