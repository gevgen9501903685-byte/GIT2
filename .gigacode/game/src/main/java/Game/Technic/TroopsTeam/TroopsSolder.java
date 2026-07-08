package Game.Technic.TroopsTeam;

import Game.Infantry.Weapon.IWeapon;
import Game.Technic.Unit.Bmp.Solder;
import Game.Technic.Unit.Tank.ARpgUnit;
import Game.Technic.Unit.Tank.Rpg7;

import java.util.List;

public class TroopsSolder extends ATroops2 {
    private static List<IWeapon> SOLDERS = List.of(Solder.SOLDER, Solder.SOLDER,
            Solder.SOLDER, Solder.SOLDER, Solder.SOLDER);

    private static List<ARpgUnit> RPG = List.of(Rpg7.RPG7, Rpg7.RPG7, Rpg7.RPG7);

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