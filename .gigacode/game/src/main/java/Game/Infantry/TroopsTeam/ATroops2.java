package Game.Infantry.TroopsTeam;

import java.util.List;

import Game.Infantry.Weapon.IWeapon;
import Game.Infantry.Unit.RPG.ARpgUnit;

public abstract class ATroops2 {

    private  List <IWeapon> units ;
    private  List <ARpgUnit> rpg ;

        // if( Arrays.stream(units).mapToDouble(e-> e.getWeight()).sum() > 100)
        //     System.out.println("ВЕСС");
        // if(Arrays.stream(units).count() > 10) System.out.println("МНОГО  ");
        // this.units = units;
        
    public ATroops2(List <IWeapon> units, List<ARpgUnit> rpg ) {
        if(units.size() + rpg.size() > 10) System.out.println("a lot init");
        this.units = units;
        this.rpg=rpg;
    }

    public double getDamage(){
        return  units.stream().mapToDouble(e-> e.getDamage()).sum() +
                rpg.stream().mapToDouble(ARpgUnit::getDamage).sum();}


    public int getPrice() {
        return units.stream().mapToInt(e-> e.getPrice()).sum()
                + rpg.stream().mapToInt(ARpgUnit::getPrice).sum();
    }


    public double getWeight() {
        return units.stream().mapToDouble(e-> e.getWeight()).sum()
                + rpg.stream().mapToDouble(ARpgUnit::getWeight).sum();
    }


    public double getAttack() {
        return rpg.stream().mapToDouble(e-> e.getAttack()).sum();
    }


    public double getBreaking() {
            return rpg.stream().mapToDouble(e-> e.getBreaking()).sum();
    }
}

