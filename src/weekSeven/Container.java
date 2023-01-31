package weekSeven;

import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container;

    private int totalWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.container = new ArrayList<Suitcase>();
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight <= this.maxWeight) {
           /* if (this.heaviestThing.getWeight() < thing.getWeight()) {
                this.heaviestThing = thing;
            }*/
            this.container.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        return this.container.size() + " suitcases (" + this.totalWeight +" kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : this.container) {
            suitcase.printThings();
        }
    }
}
