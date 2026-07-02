package Game.Unit.PECH;

import Game.Data.Weapon.IWeapon;

public class Shturm extends AUnit{
    public static final AUnit SHTURM = new Shturm();

    private Shturm(IWeapon... weapons) {
        super(weapons);
    }
}
