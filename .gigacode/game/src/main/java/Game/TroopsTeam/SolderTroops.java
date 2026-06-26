package Game.TroopsTeam;

import Game.Data.Weapon.Grenade;
import Game.Data.Weapon.Guns;
import Game.Data.Weapon.IWeapon;
import Game.Data.Weapon.RPG;
import Game.Unit.PECH.AUnit;
import Game.Unit.PECH.Solder;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;



public class SolderTroops extends ATroop{


    public static SolderTroops solderTroops  = new SolderTroops(
           Solder.solder,Solder.solder,Solder.solder,Solder.solder,Solder.solder,Solder.solder,
        Solder.solder,Solder.solder,Solder.solder,Solder.solder);


    private SolderTroops(AUnit... unit) {
        super(unit);
        
    }

}

class dem{
    static void main() {

        double pt = SolderTroops.solderTroops.getDamage();
        System.out.println(pt);

    }
}