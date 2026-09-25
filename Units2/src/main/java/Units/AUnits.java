package Units;

import Connector.TakeSession;
import EntityClass.Units;
import EntityClass.Weapons_RPG;
import lombok.Getter;

@Getter
public abstract class AUnits implements IUnits {

    private final int id;
    private Units cachedEntity;   //получениее сессии

    public AUnits(int id) {
        this.id = id;
        this.cachedEntity = TakeSession.takeSessionUnits(id);  //получениее сессии
    }
    
    public double takeDamage(){
        return cachedEntity.getDamage();
    }

    public Integer takeHealth(){
        return cachedEntity.getHealht();
    }

    public Integer takeAmmunition(){
        return cachedEntity.getAmmunition();
    }

    public Integer takePrice(){
        return cachedEntity.getPrice();
    }

    public double  takeWeight_Max(){
        return cachedEntity.getWeight_max();
    }

}
