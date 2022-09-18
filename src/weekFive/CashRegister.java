package weekFive;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    private double economicalPrice = 2.5;
    private double gourmetPrice = 4.00;

    public CashRegister() {
        this.cashInRegister = 1000.00;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven >= economicalPrice){
            this.cashInRegister += economicalPrice;
            this.economicalSold++;
            return cashGiven - economicalPrice;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven >= gourmetPrice){
            this.cashInRegister += gourmetPrice;
            this.gourmetSold++;
            return cashGiven - gourmetPrice;
        }
        return cashGiven;
    }
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if(card.balance() >= economicalPrice){
            economicalSold++;
            card.pay(economicalPrice);
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if(card.balance() >= gourmetPrice){
            gourmetSold++;
            card.pay(gourmetPrice);
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum>0){
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}