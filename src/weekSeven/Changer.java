package weekSeven;

import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes;

    public Changer(){
        this.changes = new ArrayList<>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String word) {
        for (Change change: changes
             ) {
            word = change.change(word);
        }
        return word;
    }
}
