package MechanicaWar;


import Groupes.ASquad;
import Groupes.Squad_команда1;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WarCity {

    private ASquad attaсk;
    private ASquad defend;

    public void warShow(ASquad attaсk, ASquad defend){
        var defenders = defend.getHealth() * 2 + defend.getArmor();
        System.out.println(defenders);
    }
}
class demo{

    static void main() {
        var squqd1 = Squad_команда1.SQUAD_1;
        var squqd12 = Squad_команда1.SQUAD_1;
        var warCity = new WarCity();
        warCity.warShow(squqd1,squqd12);
        System.out.println(squqd12.getArmor());
    }
}