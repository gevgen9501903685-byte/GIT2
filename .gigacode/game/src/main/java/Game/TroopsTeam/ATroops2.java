package Game.TroopsTeam;

import java.util.ArrayList;
import java.util.List;

import Game.Data.Weapon.IWeapon;
import Game.Unit.PECH.AUnit;
import Game.Unit.PECH.Solder;
import Game.Unit.RPG.ARpgUnit;
import Game.Unit.RPG.Rpg7;

public abstract class ATroops2 {

    private  List <IWeapon> units ;


        // if( Arrays.stream(units).mapToDouble(e-> e.getWeight()).sum() > 100)
        //     System.out.println("ВЕСС");
        // if(Arrays.stream(units).count() > 10) System.out.println("МНОГО  ");
        // this.units = units;
        
    public ATroops2(List <IWeapon> units ) {
        this.units = units;
    }
    public void addUnit(IWeapon unitRpg){
        this.units.add(unitRpg);
    }

    public double getDamage(){
        var pt = units.stream().mapToDouble(e-> e.getDamage()).sum();
        return pt ;


    }

    // public double getWeight(){
    //     return Arrays.stream(units).mapToDouble(e-> e.getWeight()).sum();
        
    // }
    // public int getPrice(){
    //     return Arrays.stream(units).mapToInt(e-> e.getPrice()).sum();
        
    // }

}
class rkm extends ATroops2{
    private static List <IWeapon> units = List.of(Rpg7.RPG7, Solder.solder,Solder.solder,
            Rpg7.RPG7, Solder.solder,Solder.solder,
            Solder.solder,Solder.solder,
            Solder.solder,Solder.solder);


    public static ATroops2 examp = new rkm(units);

    private rkm(List<IWeapon> units) {
        super(units);
    }
}
class dem6 {
    public static void main(String[] args) {
        System.out.println(rkm.examp.getDamage());

    }
}