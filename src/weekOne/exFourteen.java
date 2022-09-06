package weekOne;

import java.util.Scanner;

public class exFourteen {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.println("The number is" + (number < 0 ? " not": "") + " positive");
    }
}
