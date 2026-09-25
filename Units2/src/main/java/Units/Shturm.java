package Units;


import Interfeises.ITakeArmor;
import Metods.ArmorPeh;

public class Shturm extends AUnits {

    public static Shturm SHTURM = new Shturm(2);

    private ITakeArmor armor = new ArmorPeh(super.getId());

    private Shturm(int id) {
        super(id);
    }

    @Override
    public Integer takeHealth() {
        return super.takeHealth() + armor.takeArmor();
    }
}
