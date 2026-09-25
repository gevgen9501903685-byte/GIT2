package DataClassGaim.Weapon_Technic.ClassesConnect;

import DataClassGaim.Weapon_Technic.ALL.IPrice;
import DataClassGaim.Weapon_Technic.ALL.Unit;
import DataClassGaim.Weapon_Technic.Body;
import DataClassGaim.Weapon_Technic.RPG;

import java.util.Arrays;

public class ClassesConnect {

    private final Unit unit[];


    public ClassesConnect(Unit... unit) {
        this.unit = unit;

    }

    public Unit[] getUnit() {
        return unit;
    }

}
class dem {
    static void main() {
        ClassesConnect connect = new ClassesConnect(Body.average, RPG.RPG7);

        var pt = Arrays.stream(connect.getUnit()).map(IPrice::getPrice).toArray();
        System.out.println();
    }
}