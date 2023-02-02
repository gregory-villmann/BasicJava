package weekTen;
/*
* And for the third class, HealthyBurger, there will be four(4) additional member variables
*  called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price.
* The names are type String and the prices are type double.
* The constructor for this class accepts two(2) parameters for meat and price.
* Those are set in the constructor along with an appropriate name for the type of burger.
* Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and price for the addition,
*  allowing for up to two(2) addons to the basic healthy burger.
*  And finally the itemizeHamburger method created in the Hamburger class should be overridden to generate a message appropriate
*  to the type of burger along with any addons. The method also returns the total price of the healthy burger of type double.
*/
public class HealthyBurger {
    private String name;
    private String meat;
    private Double price;
    private String bread;

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        this.name = "Healthy";
        this.meat = meat;
        this.price = price;
        this.bread = "Brown roll";
    }

    public void addHealthyAddition1(String additionName, double additionPrice) {
        this.healthyExtra1Name = additionName;
        this.healthyExtra1Price = additionPrice;
    }

    public void addHealthyAddition2(String additionName, double additionPrice) {
        this.healthyExtra2Name = additionName;
        this.healthyExtra2Price = additionPrice;
    }

    public String itemizeHamburger() {
        String text = this.name + " hamburger on a "+ this.bread +" with "+ this.meat +", price is "+ this.price +"\n";
        double price = this.price;
        if (this.healthyExtra1Name != null) {
            text += "Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price +"\n";
            price += healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            text += "Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price +"\n";
            price += healthyExtra2Price;
        }
        text += "Total Burger price is " + price;
        return text;

    }
}
