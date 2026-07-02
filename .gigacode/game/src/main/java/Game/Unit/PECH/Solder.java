package Game.Unit.PECH;


import Anotaciy.ConfigLoader;
import Game.Data.Weapon.Grenade;
import Game.Data.Weapon.Guns;
import Game.Data.Weapon.IWeapon;

public class Solder extends AUnit{
    public static AUnit solder = new Solder(Guns.AKM,Grenade.PGO,Grenade.PGO,Grenade.PGO);
    private Solder(IWeapon... weapons) {
       super(weapons);

    }
}
