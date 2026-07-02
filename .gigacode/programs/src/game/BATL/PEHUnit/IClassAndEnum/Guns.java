package BATL.PEHUnit.IClassAndEnum;

public enum Guns implements IUnitPEH {
    AKM(0.3, 4, 790),   // для просых пех
    AKM105 (0.4, 5.3, 1050),   //штурмовые
    AKM128(0.55, 4.6, 1420)   //дисант
    ;

    private final double damage;
    private final double weight;
    private final int price;

    Guns(double damage, double weight,int price) {
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

