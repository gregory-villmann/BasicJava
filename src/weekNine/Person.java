package weekNine;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        if (name == null || name.equals("") || name.length() > 40) {
            throw new IllegalArgumentException("Name doesnt pass validation");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age doesnt pass validation");
        }
        this.name = name;
        this.age = age;
    }
}
