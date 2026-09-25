package Connector;

import EntityClass.Units;
import EntityClass.Weapons_RPG;
import lombok.Cleanup;

public class TakeSession  {

    // public static Units takeSessionUnits(int id){
    //     @Cleanup var session = HibernateUtil.getOpen2();

    //     Units pt = session.get(Units.class, id);

    //     if (pt == null) {
    //         throw new RuntimeException("Entity with id " + id + " Нет таких");
    //     }
    //     return  pt;
    // }
    // public static Weapons_RPG takeSessionRPG(int id){
    //     @Cleanup var session = HibernateUtil.getOpen2();

    //     Weapons_RPG rpg = session.get(Weapons_RPG.class,id);
    //     if (rpg == null) {
    //         throw new RuntimeException("Entity with id " + id + " Нет таких");
    //     }
    //     return  rpg;
    // }

    
    @SuppressWarnings("unchecked")
    public static <T> T takeSession(Class<T> clazz, int id) {
        @Cleanup var session = HibernateUtil.getOpen2();
        T entity = session.get(clazz, id);
        if (entity == null) {
            throw new RuntimeException("Entity " + clazz.getSimpleName() + " with id " + id + " not found");
        }
        return entity;
    }

    public static Units takeSessionUnits(int id) {
        return takeSession(Units.class, id);
    }

    public static Weapons_RPG takeSessionRPG(int id) {
        return takeSession(Weapons_RPG.class, id);
    }
    
    public static <T> T get(Class<T> clazz, int id) {
    return HibernateUtil.getOpen2().get(clazz, id);
}
}
