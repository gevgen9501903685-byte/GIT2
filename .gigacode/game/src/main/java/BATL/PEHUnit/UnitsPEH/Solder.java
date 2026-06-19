package BATL.PEHUnit.UnitsPEH;


import BATL.PEHUnit.IClassAndEnum.DefendPEH;
import BATL.PEHUnit.IClassAndEnum.Grenade;
import BATL.PEHUnit.IClassAndEnum.Guns;
import BATL.PEHUnit.IClassAndEnum.IUnitPEH;
import org.springframework.stereotype.Component;

@Component
public class Solder extends ASolder {

    public static Solder solder = new Solder(DefendPEH.WAR, Guns.AKM, Grenade.PGH, Grenade.PGH,Grenade.PGH);
    private Solder(IUnitPEH... unit) {
        super(unit);
    }

}