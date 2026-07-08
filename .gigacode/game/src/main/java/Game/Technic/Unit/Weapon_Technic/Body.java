package Game.Technic.Unit.Weapon_Technic;

import Game.Infantry.Weapon.IRPG;
import Game.Infantry.Weapon.IWeapon;
import Game.Technic.Unit.ITechniks;

public enum Body implements ITechniks {

    cargo (5,29000), //грузовой бронированый
    easy(10,11800), //kozak
    average(20, 19700),
    tankEasy(35, 32600); // bmp

    private final double defend;
    private final int price;

    private Body(double defend, int price) {
        this.defend = defend;
        this.price = price;
    }

    @Override
    public double getDamage() {
        return 0;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public double getDefend() {
        return defend;
    }
}
