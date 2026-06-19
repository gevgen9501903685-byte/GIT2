package Game;

import Game.Config.Config;

import Game.Data.Weapon.Grenade;
import Game.Data.Weapon.Guns;
import Game.TroopsTeam.SolderTroops;
import Game.Unit.Solder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MAIN {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        


    }
}
