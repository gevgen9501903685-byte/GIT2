package Game.Data.Weapon;

public enum Guns implements IWeapon {
    AKM(0.2, 3, 870),   // для просых пех
    AKM105 (0.25, 4.2, 1090),   //штурмовые
    AKM108(0.3, 3.5, 1412)   //дисант
    ;

    private final double damage;
    private final double weight;
    private final int price;

    Guns(double damage, double weight, int price) {
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

