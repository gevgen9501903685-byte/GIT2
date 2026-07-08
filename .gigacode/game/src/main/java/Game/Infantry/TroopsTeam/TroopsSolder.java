package Game.Infantry.TroopsTeam;

import Game.Infantry.Weapon.IWeapon;
import Game.Infantry.Unit.PECH.Solder;
import Game.Infantry.Unit.RPG.ARpgUnit;
import Game.Infantry.Unit.RPG.Rpg7;

import java.util.List;

public class TroopsSolder extends ATroops2{
    private static List<IWeapon> SOLDERS = List.of(Solder.SOLDER,Solder.SOLDER,
            Solder.SOLDER,Solder.SOLDER,Solder.SOLDER);

    private static List<ARpgUnit> RPG = List.of(Rpg7.RPG7,Rpg7.RPG7,Rpg7.RPG7);

    private TroopsSolder(List<IWeapon> units, List<ARpgUnit> rpg) {
        super(units, rpg);
    }
    public static TroopsSolder TROOPSSOLDER = new TroopsSolder(SOLDERS,RPG);
}
class desk{
    static void main() {
        System.out.println(TroopsSolder.TROOPSSOLDER.getDamage());
        System.out.println(TroopsSolder.TROOPSSOLDER.getBreaking());

    }
}