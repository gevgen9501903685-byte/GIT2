package Game.Unit;

import Game.Data.Weapon.IWeapon;

import java.util.Arrays;

public abstract class  AUnit implements IWeapon {

    public IWeapon[] weapons;

    protected IWeapon[] checkWeight(IWeapon[] weapon) {
        double j = 0;
        if( Arrays.stream(weapons).mapToDouble(e-> e.getWeight()).sum() > 10)
            System.out.println("ВЕСС");
        return weapon;
    }

    @Override
    public double getDamage() {
        double j = Arrays.stream(weapons).mapToDouble(e-> e.getDamage()).sum();
        return j;
    }

    @Override
    public int getPrice() {
        int j = (int) Arrays.stream(weapons).mapToDouble(e-> e.getPrice()).sum();
        return j;
    }

    @Override
    public double getWeight() {
        double j = Arrays.stream(weapons).mapToDouble(e-> e.getWeight()).sum();
        return j;
    }




}
