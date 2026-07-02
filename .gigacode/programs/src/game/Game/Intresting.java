package Game;


import Game.Data.Weapon.Grenade;
import Game.Data.Weapon.Guns;
import Game.Data.Weapon.IWeapon;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Intresting {


    public <c extends IWeapon> Double unit(c... weapon){
        return Arrays.stream(weapon).mapToDouble(e-> e.getDamage()).sum();
    }
}
class dem{
    static void main() {
        Intresting intr = new Intresting();
        double u = intr.unit(Guns.AKM, Grenade.PGO,Grenade.PGO);
        System.out.println(u);


    }
}