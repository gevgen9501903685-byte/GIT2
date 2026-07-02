package BATL.RPG;

import BATL.PEHUnit.IClassAndEnum.IUnitPEH;

public enum RPG implements IRPG, IUnitPEH{
    AT2 (0.8, 7.3, 920, 5, 10), // оборонительная
    AT2M (0.2,8.9, 1875,25,25),
    AT5 (1.2, 9.6,1340,10,25)  // для десанта
    ;

    private final double damage;
    private final double weight;
    private final int price;
    private final double breaking;
    private final double loss;     //урон при пробитие брони

    RPG(double damage, double weight, int price,double breaking, double loss) {
        this.damage = damage;
        this.weight = weight;
        this.price = price;
        this.breaking = breaking;
        this.loss = loss;
    }

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getPrice() {
        return price;
    }


    @Override
    public double getBreaking() {
        return breaking;
    }

    @Override
    public double getLoss() {
        return loss;
    }
}
