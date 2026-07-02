package Game.TroopsTeam;

import Game.Data.Weapon.IWeapon;
import Game.Unit.PECH.Solder;

import java.util.List;

public class TroopsSolder extends ATroops2{
    private static List<IWeapon> SOLDERS = List.of(Solder.SOLDER,Solder.SOLDER,Solder.SOLDER,
            Solder.SOLDER,Solder.SOLDER,Solder.SOLDER,
            Solder.SOLDER,Solder.SOLDER,Solder.SOLDER);

    private TroopsSolder(List<IWeapon> units) {
        super(units);
    }
    public static TroopsSolder TROOPSSOLDER = new TroopsSolder(SOLDERS);
}
class desk{
    static void main() {
        System.out.println(TroopsSolder.TROOPSSOLDER.getPrice());

    }
}