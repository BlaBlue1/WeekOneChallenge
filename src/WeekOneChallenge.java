/*
Prompt user to select two random numbers between 1 and 6
       get roll1
       get roll2
 IF roll1 and roll2 are the same numbers
    then  score is 25
 ELSE score remains the same
     Ask user if they want to roll again
     If yes
        repeat until score reaches 100 or more
     else
         user loses their turn

 END IF
 */






import java.util.ArrayList;
 */
import java.util.Random;
import java.util.Scanner;


public class WeekOneChallenge
{ public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome! Let's play Roll Dice!");


    for (int Score = 1; Score <=100; Score ++ ) {

        int roll1;
        int roll2;
        int score;




        roll1 = (int) (Math.random() * 6) + 1;
        roll2 = (int) (Math.random() * 6) + 1;
        score = (roll1 + roll2) + 1;


        System.out.println("Your first roll is " + roll1);

        System.out.println("Your second roll is " + roll2);
        System.out.println("Your total score is " + score);
        //ask the user if she/he wants to roll again
        System.out.println("Do you want to play again?");

        String output = keyboard.nextLine();













    }


}
}



