package Game.Unit.RPG;

import Game.Data.Weapon.IWeapon;
import Game.Data.Weapon.RPG;

public class Rpg7 extends ARpgUnit{
    public static final Rpg7 RPG7 = new Rpg7(Staff.STAFF, RPG.RPG7);

    private Rpg7(IWeapon staff, IWeapon rpg) {
        super(staff, rpg);
    }
}
