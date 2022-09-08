package weekThree;

import java.util.Scanner;

public class ex53 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = reader.nextLine();

        System.out.print("Enter a number: ");
        int length = Integer.parseInt(reader.nextLine());

        String output = word.substring(0,length);

        System.out.println("Result: "+output);
    }
}
