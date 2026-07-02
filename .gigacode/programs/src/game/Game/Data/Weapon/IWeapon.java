package Game.Data.Weapon;

import Game.Data.Weapon.ALL.IPrice;
import Game.Data.Weapon.ALL.IWeight;

public interface IWeapon extends IWeight, IPrice {
    public double getDamage();
    int getPrice();
    public double getWeight();
}
