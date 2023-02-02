package weekNine;

import weekNine.mooc.logic.ApplicationLogic;
import weekNine.mooc.ui.TextUserInterface;
import weekNine.mooc.ui.UserInterface;

public class ex17 {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
