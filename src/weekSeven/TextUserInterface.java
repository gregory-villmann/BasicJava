package weekSeven;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("    quit - quit the text user interface");


        label:
        while (true) {
            System.out.print("Statement: ");
            String cmd = this.reader.nextLine();
            switch (cmd) {
                case "quit":
                    System.out.println("Cheers!");
                    break label;

                case "add":
                    System.out.print("In Finnish: ");
                    String soumi = this.reader.nextLine();

                    System.out.print("Translation: ");
                    String english = this.reader.nextLine();
                    this.dictionary.add(soumi, english);
                    break;

                case "translate":
                    System.out.print("Give a word: ");
                    String word = this.reader.nextLine();
                    System.out.println("Translation: " + this.dictionary.translate(word));
                    break;

                default:
                    System.out.println("Unknown Statement");
                    break;
            }
        }

    }
}
