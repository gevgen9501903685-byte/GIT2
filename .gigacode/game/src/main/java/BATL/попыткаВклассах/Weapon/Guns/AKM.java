package BATL.попыткаВклассах.Weapon.Guns;


import BATL.попыткаВклассах.Weapon.IWeapon;
import org.springframework.beans.factory.annotation.Value;


public class AKM implements IWeapon {
    public static AKM akm = new AKM();
    @Value("${akmDamage}")
    private  double damage;
    @Value("${akmWeight}")
    private  double weight;
    @Value("${akmPrice}")
    private  int price;

    public AKM() {
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
