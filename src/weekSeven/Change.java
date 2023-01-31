package weekSeven;



public class Change {

    private char fromCharacter;
    private char toCharacter;



    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String word) {
       return word.replaceAll(Character.toString(this.fromCharacter), Character.toString(this.toCharacter));
    }



}
