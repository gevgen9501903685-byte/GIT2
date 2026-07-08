package Game.Technic.Unit.Tank;

import Game.Infantry.Weapon.IRPG;
import Game.Infantry.Weapon.RPG;
import Game.Technic.Unit.Bmp.AUnit;

public class Rpg7 extends ARpgUnit {
    public static final Rpg7 RPG7 = new Rpg7(Staff.STAFF, RPG.RPG7);

    private Rpg7(AUnit staff, IRPG rpg) {
        super(staff, rpg);
    }
}
