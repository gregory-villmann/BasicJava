package weekFive;

public class ex84 {
    public static void main(String[] args){

        Counter greg = new Counter(2,true);
        greg.decrease();
        greg.decrease();
        greg.decrease();
        System.out.println(greg.value());
    }
}
