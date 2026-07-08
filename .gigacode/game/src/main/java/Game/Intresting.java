package Game;


import Game.Infantry.Weapon.Grenade;
import Game.Infantry.Weapon.Guns;
import Game.Infantry.Weapon.IWeapon;

import java.util.Arrays;

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