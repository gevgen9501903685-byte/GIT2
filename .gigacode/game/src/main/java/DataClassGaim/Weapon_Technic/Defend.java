package Game.Technic.Unit.Weapon_Technic;

import Game.Infantry.Weapon.IWeapon;
import Game.Technic.Unit.ITechniks;

public enum Defend implements ITechniks {

    DZ1(0.2 , 870),
    DZ2 (0.25 , 1090),
    KAZ(0.3 , 1412),
    ;

    private final double defend;
    private final int price;

    private Defend(double defend, int price) {
        this.defend = defend;
        this.price = price;
    }

    @Override
    public double getDamage() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public double getDefend() {
        return defend;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
