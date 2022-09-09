package weekThree;

import java.util.Scanner;

public class ex69 {
    public static void main(String[] args){
        System.out.print("Type a text: ");
        String text = new Scanner(System.in).nextLine();

        if(text.equals(reverse(text))){
            System.out.println("The text is a palindrome");
        }else{
            System.out.println("The text is not a palindrome");
        }
    }

    public static String reverse(String word){
        String returnable = "";

        for(int i = word.length()-1; i>-1; i--){
            returnable += word.charAt(i);
        }
        return returnable;
    }
}
