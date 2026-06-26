package Game.Unit.PECH;

import java.util.Arrays;

import Game.Data.Weapon.IWeapon;

public abstract class  AUnit implements IWeapon {

    public IWeapon[] weapons;

    public AUnit(IWeapon... weapons) {
        this.weapons = weapons;
        checkWeight(weapons);
    }

    private void checkWeight(IWeapon[] weapon) {
        if( Arrays.stream(weapon).mapToDouble(IWeapon::getDamage).sum() > 10)
            System.out.println("ВЕСС");

    }

    @Override
    public double getDamage() {
        double j = Arrays.stream(weapons).mapToDouble(IWeapon::getDamage).sum();
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

    @Override
    public double getAttack() {
        return 0;
    }

    @Override
    public double getBreaking() {
        return 0;
    }
}
