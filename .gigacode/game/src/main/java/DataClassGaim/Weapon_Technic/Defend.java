package DataClassGaim.Weapon_Technic;


import DataClassGaim.Weapon_Technic.ALL.ITechniks;
import DataClassGaim.Weapon_Technic.ALL.Unit;

public enum Defend implements ITechniks, Unit {

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
    public double getDefend() {
        return defend;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getAttack() {
        return 0;
    }

    @Override
    public double getBreaking() {
        return 0;
    }


}
