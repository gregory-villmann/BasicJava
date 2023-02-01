package weekEight;

public class MilitaryService implements NationalService {

    public int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft > 0) {
            this.daysLeft--;
        }
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }
}
