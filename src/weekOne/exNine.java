package weekOne;

import java.util.Scanner;

public class exNine {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());

        System.out.print("\nDivision: " + x + " / " + y + " = " + (1.0 * x / y));
    }
}
