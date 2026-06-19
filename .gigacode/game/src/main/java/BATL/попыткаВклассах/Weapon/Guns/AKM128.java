package BATL.попыткаВклассах.Weapon.Guns;

import BATL.попыткаВклассах.Weapon.IWeapon;
import org.springframework.beans.factory.annotation.Value;


public class AKM128 implements IWeapon {
    @Value("${akm128Damage}")
    private  double damage;
    @Value("${akm128Weight}") private  double weight;
    @Value("${akm128Price}")
    private  int price;

    public AKM128() {
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
