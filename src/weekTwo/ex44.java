package weekTwo;

public class ex44 {
    public static void main(String[] args){
        int answer =  least(2, 2);
        System.out.println("Least: " + answer);
    }
    public static int least(int number1, int number2) {
        return Math.min(number1, number2);
    }
}
