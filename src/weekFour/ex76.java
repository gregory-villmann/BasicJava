package weekFour;

public class ex76 {
    public static void main(String[] args){
        Menu toidud = new Menu();

        toidud.addMeal("Supp");
        toidud.addMeal("Praad");
        toidud.addMeal("magustoit");

        toidud.printMeals();

        toidud.clearMenu();

        toidud.printMeals();
    }
}
