package weekOne;

import java.util.Scanner;

public class exTwentyTwo {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.print("Type the password: ");
            String pw = reader.nextLine();

            if(pw.equals("carrot")){
                System.out.println("Right!");
                System.out.println("\nSecret is: oogabooga");
                break;
            }else{
                System.out.println("Wrong!");
            }
        }
    }
}
