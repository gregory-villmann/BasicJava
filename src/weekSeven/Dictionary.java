package weekSeven;

import java.util.ArrayList;
import java.util.HashMap;


public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String suomi, String english) {
        this.dictionary.put(suomi, english);
    }

    public String translate(String suomi) {
       return this.dictionary.get(suomi);
    }

    public int amountOfWords() {
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        //*/
        ArrayList<String> list = new ArrayList<>();
        this.dictionary.forEach((key, value) -> {
            list.add(key + " = " + value);
        });
        return list;
    }
}
