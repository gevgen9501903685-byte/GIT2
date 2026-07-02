package Game.Data.Weapon.ALL;

public interface IAttacks {

    default double getAttack(){
        return 0;
    }; // урон если пробьет
}
