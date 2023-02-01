package weekEight;

import java.util.ArrayList;
import java.util.HashMap;

public class ex9 {

    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");


        RegistrationPlate newReg = new RegistrationPlate("FI", "ABC-123");

        VehicleRegister reg = new VehicleRegister();

        reg.add(reg1, "a");
        reg.add(reg2, "b");
        reg.add(reg3, "c");
        reg.add(newReg, "d");

        reg.printOwners();

        reg.printRegistrationPlates();

        System.out.println(reg.get(reg2));

        System.out.println(reg.get(new RegistrationPlate("FI", "UXE-465")));

        reg.delete(reg3);

        reg.printRegistrationPlates();

        reg.printOwners();

    }
}
