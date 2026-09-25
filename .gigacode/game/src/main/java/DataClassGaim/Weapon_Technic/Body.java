package DataClassGaim.Weapon_Technic;


import DataClassGaim.Weapon_Technic.ALL.ITechniks;
import DataClassGaim.Weapon_Technic.ALL.Unit;

public enum Body implements ITechniks, Unit {

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
    public double getAttack() {
        return 0;
    }

    @Override
    public double getBreaking() {
        return 0;
    }

    @Override
    public double getDefend() {
        return defend;
    }

}
