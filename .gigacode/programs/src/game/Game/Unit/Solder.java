package Game.Unit;


import Game.Data.Weapon.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class Solder extends AUnit{
    public static AUnit solder = new Solder(Guns.AKM,Grenade.PGO,Grenade.PGO,Grenade.PGO);
    private Solder(IWeapon... weapons) {
       this.weapons = weapons;

    }
}
