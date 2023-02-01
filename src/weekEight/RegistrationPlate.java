package weekEight;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return  country + " " + regCode;
    }

    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }
        return this.country.hashCode() + this.regCode.hashCode();
    }

    public String getCountry() {
        return country;
    }

    public String getRegCode() {
        return regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (!this.country.equals(compared.getCountry())) {
            return false;
        }

        return this.regCode != null && this.regCode.equals(compared.getRegCode());
    }
}
