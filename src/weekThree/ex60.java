package weekThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex60 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if(word.equals("")){
                Collections.sort(words);
                System.out.println("You typed the following words:");
                for(String wordInLoop : words){
                    System.out.println(wordInLoop);
                }
                break;
            }else{
                words.add(word);
            }
        }
    }
}
