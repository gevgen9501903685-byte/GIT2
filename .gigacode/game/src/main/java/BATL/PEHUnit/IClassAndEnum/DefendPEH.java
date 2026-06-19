package BATL.PEHUnit.IClassAndEnum;

public enum DefendPEH implements IDefendPEH, IUnitPEH {
    WAR (0.5, 7, 820), // оборонительная
    DIS (1, 10,1830)  // для спец
    ;

    private final double defend;
    private final double weight;
    private final int price;

    DefendPEH(double defend, double weight, int price) {
        this.defend = defend;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public double getDefendPEH() {
        return defend;
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
    public double getDamage() {
        return 0;
    }
}
