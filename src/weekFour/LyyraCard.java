package weekFour;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return ("The card has "+this.balance+" euros");
    }

    public void payEconomical(){
        if(this.balance >= 2.5){
            this.balance -= 2.5;
        }
    }

    public void payGourmet(){
        if(this.balance >= 4.0){
            this.balance -= 4.0;
        }
    }

    public void loadMoney(double addable){
        if(addable <= 0){
            return;
        }

        if(addable + this.balance > 150.00){
            this.balance = 150.00;
        }else{
            this.balance += addable;
        }
    }
}
