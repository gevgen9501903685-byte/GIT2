package BATL.PEHUnit.IClassAndEnum;

public enum Grenade implements IUnitPEH {
    PGO (0.05, 0.2, 180), // оборонительная
    PGH (0.15,0.35, 275),
    PGD (0.28, 0.4,470)  // для десанта
    ;

    private final double damage;
    private final double weight;
    private final int price;

    Grenade(double damage, double weight,int price) {
        this.damage = damage;
        this.weight = weight;
        this.price = price;
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
}
