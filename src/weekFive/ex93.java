package weekFive;

public class ex93 {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");
        Person greg = new Person("Greg", 15, 6, 2000);

        System.out.println( pekka.toString() );
        System.out.println( steve.toString() );
        System.out.println( greg.toString() );
    }
}
