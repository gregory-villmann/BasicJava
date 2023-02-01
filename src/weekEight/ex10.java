package weekEight;

public class ex10 {

    public static void main(String[] args) {
        CivilService serv = new CivilService();

        System.out.println(serv.daysLeft);

        serv.work();
        serv.work();
        System.out.println(serv.daysLeft);

        MilitaryService milly = new MilitaryService(355);

        System.out.println(milly.daysLeft);

        milly.work();
        milly.work();
        System.out.println(milly.getDaysLeft());
    }
}
