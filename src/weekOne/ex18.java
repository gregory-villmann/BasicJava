package weekOne;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());
        String text = "Grade: ";
        if(grade < 30){
            System.out.println(text + "failed");
        } else if (grade <= 34) {
            System.out.println(text + 1);
        } else if (grade <= 39) {
            System.out.println(text + 2);
        } else if (grade <= 44) {
            System.out.println(text + 3);
        } else if (grade <= 49) {
            System.out.println(text + 4);
        } else if (grade <= 60){
            System.out.println(text + 5);
        } else{
            System.out.println("You sure? Max points is 60!");
        }
    }
}
