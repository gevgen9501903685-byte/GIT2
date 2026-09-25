package Metods;

import Connector.TakeSession;
import EntityClass.Units;
import Interfeises.ITakeArmor;

public class ArmorPeh implements ITakeArmor {

    private final int id;
    //private Units cachedEntity;   //получениее сессии

    public ArmorPeh(int id) {
        this.id = id;
        //this.cachedEntity = TakeSession.takeSessionUnits(id);  //получениее сессии
    }
    @Override
    public Integer takeArmor(){
        return  2;                        //cachedEntity.getArmor();
    }
}
