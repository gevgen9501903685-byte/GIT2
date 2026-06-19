package BATL.Troops;

import BATL.PEHUnit.IClassAndEnum.IUnitPEH;
import BATL.PEHUnit.UnitsPEH.Solder;
import BATL.RPG.RPG;

public class TroopsSolder extends ATroops{
    public static TroopsSolder TROPOSSOLDER = new TroopsSolder(Solder.solder,Solder.solder,
            Solder.solder,Solder.solder,Solder.solder,Solder.solder,Solder.solder,Solder.solder,
            Solder.solder,Solder.solder, RPG.AT5,RPG.AT5);

    private TroopsSolder(IUnitPEH... sold) {
        super(sold);
    }
}
class dem {
    static void main() {
        var pt = TroopsSolder.TROPOSSOLDER.getPrice();
        System.out.println(pt);
    }
}