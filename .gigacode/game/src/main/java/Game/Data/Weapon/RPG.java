package Game.Data.Weapon;

import Game.Data.Weapon.ALL.IAttacks;
import Game.Data.Weapon.ALL.ITank;

public enum RPG implements IWeapon, IAttacks, ITank{
    RPG7 (0.3,2,10,8,2730,15)

    ;
    private final double damage;
    private final double Attack;
    private final double Anti_tank;
    private final double weight;
    private final int price;
    private final double breaking;   //пробитие

    RPG(double damage, double attack, double anti_tank, double weight, int price, double breaking) {
        this.damage = damage;
        Attack = attack;
        Anti_tank = anti_tank;
        this.weight = weight;
        this.price = price;
        this.breaking = breaking;
    }


    @Override
    public double getAttack() {
        return Attack;
    }

    @Override
    public double getBreaking() {
        return breaking;
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


    @Override
    public double getAnti_tank() {
        return Anti_tank;
    }
}
