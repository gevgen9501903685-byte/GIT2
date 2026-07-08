package Game.Technic.Unit.Weapon_Technic;

import Game.Infantry.Weapon.IRPG;
import Game.Infantry.Weapon.IWeapon;
import Game.Technic.Unit.ITechniks;

public enum Shells_CH implements ITechniks {

    cn30 (0.1,5,20, 120 ),

    cn105k(0,33,40, 6700); //подкалибр

    private final double damage;// пех урон
    private final int price;
    private final double attack; // урон если пробьет
    private final double breaking;  //пробитее брони

    Shells_CH(double damage, double attack, double breaking, int price) {
        this.damage = damage;
        this.price = price;
        this.attack = attack;
        this.breaking = breaking;
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
    public double getAttack() {
        return attack;
    }

    @Override
    public double getBreaking() {
        return breaking;
    }

    @Override
    public double getDefend() {
        return ITechniks.super.getDefend();
    }


}
