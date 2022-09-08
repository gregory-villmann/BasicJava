package weekThree;

import java.util.Scanner;

public class ex50 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Give me your name: ");
        String name = reader.nextLine();
        if(name.length() < 3){
            System.out.println("name has to be at least 3 char long");
            return;
        }

        for(int i = 0; i < 3; i++){
            System.out.println(i+1+". character: " + name.charAt(i));
        }
    }

}
