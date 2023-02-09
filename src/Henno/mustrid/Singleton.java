package Henno.mustrid;

public class Singleton {
    private static Singleton instance;

    private Singleton() {} // Väga oluline et konstruktor on private

    public static Singleton getInstance() {
        if (instance == null) { // Kas instants singletonist juba on olemas?
            instance = new Singleton(); // Singletoni instants puudub, loome instantsi
        }
        return instance; // instants eksisteerib, tagastame selle
    }
}
