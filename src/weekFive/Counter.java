package weekFive;

public class Counter {
    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
    }
    public Counter(int startingValue){
        this.startingValue = startingValue;
        this.check = false;
    }
    public Counter(boolean check){
        this.startingValue = 0;
        this.check = check;
    }
    public Counter(){
        this.startingValue = 0;
        this.check = false;
    }


    public int value(){
        return this.startingValue;
    }

    public void increase(){
        this.startingValue++;
    }
    public void increase(int increaseAmount){
        if(increaseAmount>=0){
            this.startingValue += increaseAmount;
        }
    }
    public void decrease(){
        if(this.check && this.startingValue>=1){
            this.startingValue--;
        } else if (!this.check){
            this.startingValue--;
        }
    }
    public void decrease(int decreaseAmount){
        if(!this.check && decreaseAmount >= 0){
            this.startingValue -= decreaseAmount;
        } else if(this.check && decreaseAmount >= 0){
            if(this.startingValue-decreaseAmount >= 0){
                this.startingValue -= decreaseAmount;
            }
        }
    }
}
