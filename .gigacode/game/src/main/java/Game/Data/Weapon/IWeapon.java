package Game.Data.Weapon;

import Game.Data.Weapon.ALL.IAttacks;
import Game.Data.Weapon.ALL.IBreaking;
import Game.Data.Weapon.ALL.IPrice;
import Game.Data.Weapon.ALL.IWeight;

public interface IWeapon {
    public double getDamage();
    int getPrice();
    public double getWeight();
    default double getDefend(){return 0;}
}
