package weekTwo;

import java.util.Random;
import java.util.Scanner;

public class ex41 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        int randomNumber = new Random().nextInt(101);
        int guesses = 0;

        while(true){
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());

            if(randomNumber == guess){
                System.out.println("Congratulations, your guess is correct!");
                guesses++;
                System.out.println("Guesses made: "+ guesses);
                break;
            }else if(guess < randomNumber){
                System.out.println("The number is greater");
            } else{
                System.out.println("The number is lesser");
            }
            guesses++;
        }

    }
}
