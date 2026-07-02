package Game.Unit.RPG;

import Game.Data.Weapon.Guns;
import Game.Data.Weapon.IWeapon;
import Game.Unit.PECH.AUnit;

public class Staff extends AUnit{

    public static IWeapon STAFF = new Staff(Guns.AKM);

    private Staff(IWeapon... weapons) {
        this.weapons = weapons;
}}
