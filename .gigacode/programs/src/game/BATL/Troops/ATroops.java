package BATL.Troops;

import BATL.PEHUnit.IClassAndEnum.IDefendPEH;
import BATL.PEHUnit.IClassAndEnum.IUnitPEH;
import BATL.PEHUnit.UnitsPEH.Solder;
import BATL.RPG.IRPG;
import BATL.RPG.RPG;

import java.util.Arrays;

 abstract class ATroops implements IUnitPEH {
    private final IUnitPEH[] sold;

    private boolean check(){
        double maxWeight = 17 * (sold.length);
     if(getWeight()>maxWeight){
         throw new RuntimeException("ВЕС");
     }
     return true;
    }
    ATroops(IUnitPEH... sold) {
        this.sold = sold;
        check();
    }
    public double getDamage(){
        return Arrays.stream(sold).mapToDouble(IUnitPEH::getDamage).sum();}

    public double getWeight(){
        return Arrays.stream(sold).mapToDouble(e-> e.getWeight()).sum();}

    public int getPrice(){return Arrays.stream(sold).mapToInt(e-> e.getPrice()).sum();}
}
