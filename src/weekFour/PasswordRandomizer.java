package weekFour;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables here
    private int length;

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.length = length;
    }

    public String createPassword() {
        // Write the code here which returns the new password
        int number = this.length;
        String pw = "";

        for(int i = 0; i<number; i++){
            int randomInt = new Random().nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(randomInt);
            pw += symbol;
        }


        return pw;
    }
}
