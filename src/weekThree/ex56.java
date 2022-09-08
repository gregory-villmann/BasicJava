package weekThree;

import java.util.Scanner;

public class ex56 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    public static String reverse(String word){
        String returnable = "";

        for(int i = word.length()-1; i>-1; i--){
            returnable += word.charAt(i);
        }
        return returnable;
    }
}
