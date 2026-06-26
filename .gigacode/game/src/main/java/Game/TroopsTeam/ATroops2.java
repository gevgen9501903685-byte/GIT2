package Game.TroopsTeam;

import java.util.ArrayList;
import java.util.List;

import Game.Unit.PECH.AUnit;
import Game.Unit.PECH.Solder;
import Game.Unit.RPG.ARpgUnit;
import Game.Unit.RPG.Rpg7;

public abstract class ATroops2 {

    private  List <AUnit> units ;
    private  List <ARpgUnit> unitRpg ;

        // if( Arrays.stream(units).mapToDouble(e-> e.getWeight()).sum() > 100)
        //     System.out.println("ВЕСС");
        // if(Arrays.stream(units).count() > 10) System.out.println("МНОГО  ");
        // this.units = units;
        
    public ATroops2(List <AUnit> units, List <ARpgUnit> unitRpg  ) {
        this.unitRpg = unitRpg;
        this.units = units;
    }
    public void addUnit(ARpgUnit unitRpg){
        this.unitRpg.add(unitRpg);
    }

    public double getDamage(){
        var pt = units.stream().mapToDouble(e-> e.getDamage()).sum();
        var pt2 = unitRpg.stream().mapToDouble(e-> e.getDamage()).sum();
        return pt + pt2;


    }

    // public double getWeight(){
    //     return Arrays.stream(units).mapToDouble(e-> e.getWeight()).sum();
        
    // }
    // public int getPrice(){
    //     return Arrays.stream(units).mapToInt(e-> e.getPrice()).sum();
        
    // }

}
class rkm extends ATroops2{
    private static List <AUnit> units = List.of(Solder.solder,Solder.solder,Solder.solder,Solder.solder,Solder.solder);
    private static List <ARpgUnit> unitRpg = List.of(Rpg7.RPG7,Rpg7.RPG7);

    public static ATroops2 examp = new rkm(units,unitRpg);

    private rkm(List<AUnit> units, List<ARpgUnit> unitRpg) {
        super(units, unitRpg);
    }
}
class dem6 {
    public static void main(String[] args) {
        System.out.println(rkm.examp.getDamage());

    }
}