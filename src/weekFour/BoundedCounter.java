package weekFour;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if(this.value < this.upperLimit){
            this.value++;
        }else{
            this.value = 0;
        }
    }

    public String toString() {
        if(this.value < 10 && this.value >= 0){
            return "0"+this.value;
        }
        return Integer.toString(this.value);
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        if(value >= 0 && value <= this.upperLimit){
            this.value = value;
        }
    }
}
