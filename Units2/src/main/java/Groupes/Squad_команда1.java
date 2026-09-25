package Groupes;

import RPG.ARPG;
import RPG.RPG7;
import Units.AUnits;
import Units.Solder;

import java.util.List;
import java.util.stream.Stream;

public class Squad_команда1 extends ASquad {

    public static ASquad SQUAD_1 = new Squad_команда1(10,5, Solder.SOLDER,RPG7.RPG);

    private Squad_команда1(int quantityUnit, int quantityRpg, AUnits unit, ARPG rpg) {
        super(quantityUnit, quantityRpg, unit, rpg);
    }

}
class demo {
    static void main() {
        var unit = Squad_команда1.SQUAD_1;
        var unit2 = Squad_команда1.SQUAD_1;
        var unit3 = Squad_команда1.SQUAD_1;
        List<ASquad> all = List.of(unit,unit2,unit3);
        var pt = all.stream().mapToDouble(e-> e.getDamage()).sum();
        System.out.println(pt);

    }
}