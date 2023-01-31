package weekSeven;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;

    private Thing heaviestThing;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
        this.heaviestThing = new Thing("", 0);
    }

    public void addThing(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
            if (this.heaviestThing.getWeight() < thing.getWeight()) {
                this.heaviestThing = thing;
            }
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        int amountItems = this.things.size();
        if (amountItems == 0) {
            return "empty (0 kg)";
        } else if (amountItems == 1) {
            return "1 thing (" +  this.totalWeight() +" kg)";
        }
        return amountItems + " things (" +  this.totalWeight() +" kg)";
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {
        return this.heaviestThing;
    }
}
