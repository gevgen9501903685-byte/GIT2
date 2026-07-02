package Game.Unit.RPG;

import Game.Data.Weapon.IRPG;
import Game.Data.Weapon.IWeapon;
import Game.Data.Weapon.RPG;
import Game.Unit.PECH.AUnit;

public class Rpg7 extends ARpgUnit{
    public static final Rpg7 RPG7 = new Rpg7(Staff.STAFF, RPG.RPG7);

    private Rpg7(AUnit staff, IRPG rpg) {
        super(staff, rpg);
    }
}
