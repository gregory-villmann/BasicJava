package weekOne;

import java.util.Scanner;

public class exSixteen {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int remainder = number % 2;

        if(remainder == 0){
            System.out.println("Number " + number + " is even");
        }else{
            System.out.println("Number " + number + " is odd");
        }
    }
}
