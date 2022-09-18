package weekFive;

public class MyDate {
    private int date;
    private int month;
    private int year;

    public MyDate(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate(){
        return this.date;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public String toString() {
        return this.date + "." + this.month +"."+this.year;
    }
}
