package RPG;

import Connector.TakeSession;
import EntityClass.Weapons_RPG;

public abstract  class ARPG {

        private final  int id ;
        private Weapons_RPG cachedEntity;

    public ARPG(int id) {
        this.id = id;
        this.cachedEntity = TakeSession.takeSessionRPG(id);
    }

    public double takeDamage(){
        return cachedEntity.getDamage();
    }

    public double  takeArmorPenetration(){
        return cachedEntity.getArmor_penetration();
    }

    public Integer takePrice(){
        return cachedEntity.getPrice();
    }
    public double  takeWeight(){
        return cachedEntity.getWeight();
    }

}
