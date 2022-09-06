package weekOne;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());

        System.out.println("\nCircumference of the circle: " + (2 * Math.PI * radius));
    }
}
