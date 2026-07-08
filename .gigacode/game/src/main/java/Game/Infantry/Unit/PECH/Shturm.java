package Game.Infantry.Unit.PECH;

import Game.Infantry.Weapon.IWeapon;

public class Shturm extends AUnit{
    public static final AUnit SHTURM = new Shturm();

    private Shturm(IWeapon... weapons) {
        super(weapons);
    }
}
