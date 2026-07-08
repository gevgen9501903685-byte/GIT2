package Game.Technic.Unit.Bmp;


import Game.Infantry.Weapon.Grenade;
import Game.Infantry.Weapon.Guns;
import Game.Infantry.Weapon.IWeapon;

public class Solder extends AUnit {
    public static IWeapon SOLDER = new Solder(Guns.AKM,Grenade.PGO,Grenade.PGO,Grenade.PGO);
    private Solder(IWeapon... weapons) {
       super(weapons);

    }
}
