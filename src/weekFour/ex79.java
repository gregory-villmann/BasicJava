package weekFour;

import java.util.Scanner;

public class ex79 {
    public static void main(String[] args){
        addNums2();
    }



    public static void addNums(){
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        System.out.println("Type numbers:");
        while (true){
            int num = Integer.parseInt(reader.nextLine());

            if(num != -1){
                stats.addNumber(num);
            }else{
                break;
            }
        }
        System.out.println("sum: " + stats.sum());
    }

    public static void addNums2(){
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        System.out.println("Type numbers:");
        while (true){
            int num = Integer.parseInt(reader.nextLine());

            if(num != -1){
                stats.addNumber(num);
                if(num%2 == 0){
                    even.addNumber(num);
                }else{
                    odd.addNumber(num);
                }
            }else{
                break;
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum even: " + even.sum());
        System.out.println("sum odd: " + odd.sum());
    }
}
