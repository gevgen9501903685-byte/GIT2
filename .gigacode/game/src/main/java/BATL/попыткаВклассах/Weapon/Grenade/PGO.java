package BATL.попыткаВклассах.Weapon.Grenade;


import Game.Infantry.Weapon.IWeapon;
import org.springframework.beans.factory.annotation.Value;

public class PGO implements IWeapon {

    @Value("${PgoDamage}")
    private  double damage;
    @Value("${PgoWeight}")
    private  double weight;
    @Value("${PgoPrice}")
    private  int price;

    public PGO() {
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
