package weekFive;

import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    }
    public Person(String name, MyDate myDate) {
        this.name = name;
        this.birthday = myDate;
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int todayDate = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int todayYear =  Calendar.getInstance().get(Calendar.YEAR);

        if(this.birthday.getMonth() < todayMonth){
            return todayYear - this.birthday.getYear();
        } else if (this.birthday.getMonth() == todayMonth) {
            if(todayDate < this.birthday.getDate()){
                return (todayYear - this.birthday.getYear())-1;
            }else{
                return todayYear - this.birthday.getYear();
            }
        }else{
            return (todayYear - this.birthday.getYear())-1;
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday.toString();
    }

    public boolean olderThan(Person compared){
        if(this.birthday.getYear() < compared.birthday.getYear()){
            return true;
        } else if(this.birthday.getYear() == compared.birthday.getYear()){
            if(this.birthday.getMonth() < compared.birthday.getMonth()){
                return true;
            }else if(this.birthday.getMonth() < compared.birthday.getMonth()){
                if(this.birthday.getDate() < compared.birthday.getDate()){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}