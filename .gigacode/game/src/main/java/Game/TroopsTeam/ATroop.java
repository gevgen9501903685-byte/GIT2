package Game.TroopsTeam;

import java.util.Arrays;

import Game.Data.Weapon.IWeapon;
import Game.Unit.PECH.AUnit;

public abstract class ATroop implements IWeapon{
    public AUnit [] units;

    ATroop(AUnit... units) {
        // if( Arrays.stream(units).mapToDouble(e-> e.getWeight()).sum() > 100)
        //     System.out.println("ВЕСС");
        if(Arrays.stream(units).count() > 10) System.out.println("МНОГО  ");
        this.units = units;
        
    }

    public double getDamage(){
        double j = Arrays.stream(units).mapToDouble(e-> e.getDamage()).sum();
        return j;
    }
    public double getWeight(){
        return Arrays.stream(units).mapToDouble(e-> e.getWeight()).sum();
        
    }
    public int getPrice(){
        return Arrays.stream(units).mapToInt(e-> e.getPrice()).sum();
        
    }

}
