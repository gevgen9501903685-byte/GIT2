package BATL.PEHUnit.UnitsPEH;


import BATL.PEHUnit.IClassAndEnum.DefendPEH;
import BATL.PEHUnit.IClassAndEnum.Grenade;
import BATL.PEHUnit.IClassAndEnum.Guns;
import BATL.PEHUnit.IClassAndEnum.IUnitPEH;


public class Shturm extends ASolder{

    public static Shturm shturm = new Shturm(DefendPEH.WAR, Guns.AKM, Grenade.PGH, Grenade.PGH,Grenade.PGH);

    private Shturm(IUnitPEH... unit) {
        super(unit);
    }
}
