package Game.Infantry.Unit.RPG;

import Game.Infantry.Weapon.Guns;
import Game.Infantry.Weapon.IWeapon;
import Game.Infantry.Unit.PECH.AUnit;

public class Staff extends AUnit{

    public static AUnit STAFF = new Staff(Guns.AKM);

    private Staff(IWeapon... weapons) {
        this.weapons = weapons;
}}
