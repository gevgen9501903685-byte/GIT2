package Game.Data.Weapon;

public enum Defend implements IWeapon{

    AKM(0.2, 3, 870),   // для просых пех
    AKM105 (0.25, 4.2, 1090),   //штурмовые
    AKM108(0.3, 3.5, 1412),   //дисант
    RPK (0.7, 8,2900)  //нужен staff
    ;

    private final double defend;
    private final double weight;
    private final int price;

    private Defend(double defend, double weight, int price) {
        this.defend = defend;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public double getDamage() {
        return 0;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getDefend() {
        return defend;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
