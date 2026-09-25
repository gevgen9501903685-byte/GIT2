package Game.Infantry.Weapon;

public interface IRPG {
    public double getDamage();
    int getPrice();
    public double getWeight();
    double getAttack(); // урон если пробьет
    double getBreaking(); //пробитее брони
}
