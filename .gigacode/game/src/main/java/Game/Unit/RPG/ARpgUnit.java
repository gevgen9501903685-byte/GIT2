package Game.Unit.RPG;

import Anotaciy.PropertiesUtil;
import Game.Data.Weapon.IRPG;
import Game.Unit.PECH.AUnit;

public class ARpgUnit{

    private final AUnit staff;
    private final IRPG rpg;

    public ARpgUnit(AUnit staff, IRPG rpg) {
        checkWeight(staff,rpg);
        this.staff = staff;
        this.rpg = rpg;
    }

    private void checkWeight(AUnit unit, IRPG rpg) {
        if((unit.getWeight() + rpg.getWeight() ) > Integer.parseInt(PropertiesUtil.get("weight_RPG")))
            System.out.println("ВЕСС");

    }

    public double getDamage() {
        return staff.getDamage() + rpg.getDamage();
    }

    public int getPrice() {
        return rpg.getPrice() + staff.getPrice();
    }

    public double getWeight() {
        return staff.getWeight() + rpg.getWeight();
    }
    public double getAttack() {
        return rpg.getAttack();
    }

    public double getBreaking() {
        return rpg.getBreaking();
    }
}
