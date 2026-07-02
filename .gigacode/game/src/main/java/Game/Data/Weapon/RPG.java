package Game.Data.Weapon;

public enum RPG implements IWeapon{
    RPG7 (0.3,20,7,2730,15)

    ;
    private final double damage; // пех урон
    private final double Attack; // урон при пробитее
    private final double weight;
    private final int price;
    private final double breaking;   //пробитие

    private RPG(double damage, double attack, double weight, int price, double breaking) {
        this.damage = damage;
        Attack = attack;

        this.weight = weight;
        this.price = price;
        this.breaking = breaking;
    }


    @Override
    public double getAttack() {
        return Attack;
    }

    @Override
    public double getBreaking() {
        return breaking;
    }

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

}
