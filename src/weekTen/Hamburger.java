package weekTen;

public class Hamburger {
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

    public Hamburger(String name, String meat, Double price, String bread) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        this.addition1name = additionName;
        this.addition1price = additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        this.addition2name = additionName;
        this.addition2price = additionPrice;
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        this.addition3name = additionName;
        this.addition3price = additionPrice;
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        this.addition4name = additionName;
        this.addition4price = additionPrice;
    }

    public String itemizeHamburger() {
        String text = this.name + " hamburger on a "+ this.bread +" with "+ this.meat +", price is "+ this.price +"\n";
        double price = this.price;
        if (this.addition1name != null) {
            text += "Added " + this.addition1name + " for an extra " + this.addition1price +"\n";
            price += addition1price;
        }
        if (this.addition2name != null) {
            text += "Added " + this.addition2name + " for an extra " + this.addition2price +"\n";
            price += addition2price;
        }
        if (this.addition3name != null) {
            text += "Added " + this.addition3name + " for an extra " + this.addition3price +"\n";
            price += addition3price;
        }
        if (this.addition4name != null) {
            text += "Added " + this.addition4name + " for an extra " + this.addition4price +"\n";
            price += addition4price;
        }
        text += "Total Burger price is " + price;
        return text;

    }
}
