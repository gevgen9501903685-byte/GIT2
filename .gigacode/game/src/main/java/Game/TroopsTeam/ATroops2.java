package Game.TroopsTeam;

import java.util.ArrayList;
import java.util.List;

import Game.Data.Weapon.IRPG;
import Game.Data.Weapon.IWeapon;
import Game.Unit.PECH.AUnit;
import Game.Unit.PECH.Solder;
import Game.Unit.RPG.ARpgUnit;
import Game.Unit.RPG.Rpg7;

public abstract class ATroops2 {

    private  List <IWeapon> units ;
    private  List <IRPG> rpg ;

        // if( Arrays.stream(units).mapToDouble(e-> e.getWeight()).sum() > 100)
        //     System.out.println("ВЕСС");
        // if(Arrays.stream(units).count() > 10) System.out.println("МНОГО  ");
        // this.units = units;
        
    public ATroops2(List <IWeapon> units,List <IRPG> rpg ) {
        if(units.size() > 10) System.out.println("a lot init");
        this.units = units;
        this.rpg=rpg;
    }

    public void addUnit(IWeapon unitRpg){
        this.units.add(unitRpg);
    }


    public double getDamage(){
        var pt = units.stream().mapToDouble(e-> e.getDamage()).sum();
        return pt ;}


    public int getPrice() {
        return units.stream().mapToInt(e-> e.getPrice()).sum();
    }


    public double getWeight() {
        return units.stream().mapToDouble(e-> e.getWeight()).sum();
    }


    public double getAttack() {
        return rpg.stream().mapToDouble(e-> e.getAttack()).sum();
    }


    public double getBreaking() {
            return rpg.stream().mapToDouble(e-> e.getBreaking()).sum();
    }
}

