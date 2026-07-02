package Game.Unit.PECH;

import java.util.Arrays;

import Anotaciy.ConfigProperties;
import Anotaciy.PropertiesUtil;
import Anotaciy.Property;
import Game.Data.Weapon.IWeapon;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


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
