package Game.Technic.Unit.Bmp;

import Anotaciy.PropertiesUtil;
import Game.Infantry.Weapon.IWeapon;

import java.util.Arrays;


public abstract class  AUnit implements IWeapon {

    public IWeapon[] weapons;



    public AUnit(IWeapon... weapons) {
        this.weapons = weapons;
        checkWeight(weapons);
    }

    private void checkWeight(IWeapon[] weapon) {
        if( Arrays.stream(weapon).mapToDouble(IWeapon::getDamage).sum() > Integer.parseInt(PropertiesUtil.get("max_weight_solder")))
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

}
