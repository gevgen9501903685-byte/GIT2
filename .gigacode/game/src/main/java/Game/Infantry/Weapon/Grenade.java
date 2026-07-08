package Game.Infantry.Weapon;

public enum Grenade implements IWeapon{
    PGO (0.1, 0.2, 106), // оборонительная
    PGH (0.2,0.35, 198),
    PGD (0.3, 0.4, 247)  // для десанта
    ;

    private final double damage;
    private final double weight;
    private final int price;

    private Grenade(double damage, double weight, int price) {
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
