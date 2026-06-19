package BATL.PEHUnit.UnitsPEH;



import BATL.PEHUnit.IClassAndEnum.IDefendPEH;
import BATL.PEHUnit.IClassAndEnum.IUnitPEH;

import java.util.Arrays;

public abstract class ASolder implements IUnitPEH, IDefendPEH {
    private IUnitPEH[] unit;
    double health = 1 ;

    private double maxWeight = 17  ;

     ASolder(IUnitPEH... unit) {
        this.unit = unit;

        check();
    }
   private boolean check(){
        if(getWeight()>maxWeight){
            throw new RuntimeException("ВЕС");
        }
        return true;
    }
    public double getHealth(){
        return health + getDefendPEH();
    }
    public double getDamage(){
        return Arrays.stream(unit).mapToDouble(IUnitPEH::getDamage).sum();}

    @Override
    public double getDefendPEH() {
        return getDefendPEH();
    }

    public double getWeight(){
        return Arrays.stream(unit)
                .mapToDouble(e-> e.getWeight())
                .sum();

    }
    public int getPrice(){
         return Arrays.stream(unit)
            .mapToInt(e-> e.getPrice())
            .sum();}
}
