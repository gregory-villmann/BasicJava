package weekOne;

public class ex5 {
    public static void main(String[] args){
        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int days = 365; // not a leap year

        int secondsInAYear = seconds * minutes * hours * days;

        System.out.println("There are " + secondsInAYear + " seconds in a year.");
    }
}
