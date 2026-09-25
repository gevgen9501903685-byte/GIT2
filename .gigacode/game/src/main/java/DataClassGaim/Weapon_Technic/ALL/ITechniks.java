package Game.Technic.Unit;

public interface ITechniks {
    public double getDamage();
    int getPrice();
    double getAttack(); // урон если пробьет
    double getBreaking(); //пробитее брони
    default double getDefend(){return 0;}
}
