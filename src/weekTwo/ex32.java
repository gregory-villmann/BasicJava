package weekTwo;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what num? ");
        int until = Integer.parseInt(reader.nextLine());

        int adder = 1;
        int sum = 0;

        while(adder <= until){
            sum += adder;
            adder++;
        }
        System.out.println("Sum is "+sum);
    }
}
