package weekEight;

import java.util.HashMap;

public class VehicleRegister {

    public HashMap<RegistrationPlate, String> vehicleRegister;

    public VehicleRegister() {
        this.vehicleRegister = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.vehicleRegister.get(plate) != null) {
            return false;
        }
        this.vehicleRegister.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (plate.getRegCode() == null) {
            return null;
        }
        if (this.vehicleRegister.containsKey(plate)) {
            return this.vehicleRegister.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.vehicleRegister.containsKey(plate)) {
            this.vehicleRegister.put(plate, null);
            return true;
        }
        return false;
    }

    public void printOwners() {
        this.vehicleRegister.forEach((key, value) -> System.out.println(value));
    }

    public void printRegistrationPlates() {
        this.vehicleRegister.forEach((key, value) -> System.out.println(key));
    }
}
