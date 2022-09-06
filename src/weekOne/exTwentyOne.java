package weekOne;

import java.util.Scanner;

public class exTwentyOne {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        boolean checkOne = ((1.0 * year / 4) % 1) == 0;
        boolean checkTwo = (((1.0 * year / 100) % 1) == 0);
        boolean checkThree = (((1.0 * year / 400) % 1) == 0);

        if(checkOne){
            if(checkTwo){
                if(checkThree){
                    System.out.println("The year is a leap year.");
                }else{
                    System.out.println("The year is not a leap year.");
                }
                return;
            }
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
    }
}
