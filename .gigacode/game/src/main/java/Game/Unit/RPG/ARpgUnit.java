package Game.Unit.RPG;

import Game.Data.Weapon.IWeapon;

public class ARpgUnit implements IWeapon{

    private final IWeapon staff;
    private final IWeapon rpg;

    public ARpgUnit(IWeapon staff, IWeapon rpg) {
        checkWeight(staff,rpg);
        this.staff = staff;
        this.rpg = rpg;
    }

    private void checkWeight(IWeapon unit, IWeapon rpg) {
        if((unit.getWeight() + rpg.getWeight() ) > 15)
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
