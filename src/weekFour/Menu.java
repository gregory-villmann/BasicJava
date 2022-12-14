package weekFour;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // Implement the methods here

    public void addMeal(String meal){
        this.meals.add(meal);
    }
    public void printMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        this.meals.clear();
    }
}
