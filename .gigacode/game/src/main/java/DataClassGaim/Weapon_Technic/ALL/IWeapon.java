package DataClassGaim.Weapon_Technic.ALL;

public interface IWeapon {
    public double getDamage();
    int getPrice();
    public double getWeight();
    default double getDefend(){return 0;}
}
