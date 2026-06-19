package BATL.попыткаВклассах.Weapon.Guns;

import BATL.попыткаВклассах.Weapon.IWeapon;
import org.springframework.beans.factory.annotation.Value;


public class AKM105 implements IWeapon {

    @Value("${akm105Damage}")
    private  double damage;
    @Value("${akm105Weight}")
    private  double weight;
    @Value("${akm105Price}")
    private  int price;

    public AKM105() {
        this.damage = damage;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
