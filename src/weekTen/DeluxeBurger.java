package weekTen;

public class DeluxeBurger {
    private String name;
    private String meat;
    private Double price;
    private String bread;

    private String addition1name;
    private double addition1price;
    private String addition2name;
    private double addition2price;
    private String addition3name;
    private double addition3price;
    private String addition4name;
    private double addition4price;

    public DeluxeBurger() {
        this.name = "Deluxe";
        this.meat = "Sausage & Bacon";
        this.price = 14.54;
        this.bread = "Potato roll";
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger\n");
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger\n");
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger\n");
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger\n");
    }

    public String itemizeHamburger() {
        String text = this.name + " hamburger on a "+ this.bread +" with "+ this.meat +", price is "+ this.price +"\n";
        double price = this.price + 2.75 + 1.81;

        text += ("Added Chips for an extra 2.75\n" +
                "Added Drink for an extra 1.81\n");
        text += "Total Burger price is " + price;
        return text;

    }
}
