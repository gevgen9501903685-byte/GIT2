package GameSpringAOP.Propertis;

public enum Grenade implements Damage, Weight, Price {
    PGO (0.05, 0.2, 120), // оборонительная
    PGH (0.15,0.35, 175),
    PGD (0.28, 0.4,240)  // для десанта
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
