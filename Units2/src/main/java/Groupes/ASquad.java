package Groupes;

import RPG.ARPG;
import Units.AUnits;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

@Data
@AllArgsConstructor
public abstract class ASquad {

    int quantityUnit ;
    int quantityRpg ;
    AUnits unit ;
    ARPG rpg ;

    double getDamage() {return getDamageUnit() + // весь урон
            (rpg.takeDamage() * quantityRpg);}

    @SneakyThrows
    double getDamageUnit() {   // урон только юнит
        checkWeight();
        return unit.takeDamage() * quantityUnit;
    }


    double getPrice() {

        return ( unit.takePrice() * quantityUnit) + (rpg.takePrice() * quantityRpg);
    }

    boolean checkWeight() throws Exception {
        double weightWeaipons = rpg.takeWeight()* quantityRpg;
        if (weightWeaipons > (unit.takeWeight_Max()*quantityUnit)){
           System.out.println("mistaik");
           throw new Exception("bad");
        }
        return true;
   }

    public Integer getHealth(){

        return (unit.takeHealth() * quantityUnit) ;
    }


    public double getDamageAmmunition(){

        return  unit.takeAmmunition() * getDamage();
    }

    public double  getPenetration(){

        return rpg.takeArmorPenetration() * quantityRpg;
    }
}
