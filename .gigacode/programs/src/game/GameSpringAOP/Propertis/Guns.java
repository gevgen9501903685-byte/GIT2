package GameSpringAOP.Propertis;

public enum Guns implements Damage, Weight,Price {
    AKM(0.2, 3, 790),   // для просых пех
    AKM105 (0.25, 4.2, 1050),   //штурмовые
    AKM128(0.3, 3.5, 1420)   //дисант
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
    public double damage() {
        return damage;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

