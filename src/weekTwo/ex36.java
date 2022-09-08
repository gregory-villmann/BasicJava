package weekTwo;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int typedNums = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers:");
        while(true){
            int num = Integer.parseInt(reader.nextLine());
            if(num == -1){
                System.out.println("Thank you and see you later!");
                break;
            }
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
            sum += num;
            typedNums++;
        }
        double avgOfSum = 1.0 *  sum / typedNums;

        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+typedNums);
        System.out.println("Average: "+avgOfSum);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
