package weekSeven;

public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("\\:D/");
    }

    private static void printWithSmileys(String characterString) {
        String startEnd = "";
        for (int i = 0; i < characterString.length(); i++) {
            startEnd += ":)";
        }
        System.out.println(startEnd);

        if(characterString.length() % 2 == 1) {
            System.out.println(":)"+characterString + " :)");
        } else {
            System.out.println(":)"+characterString+":)");
        }

        System.out.println(startEnd);
    }
}
