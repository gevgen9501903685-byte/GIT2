package GameSpringAOP.Unit;

import GameSpringAOP.Propertis.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Solder implements Damage, Weight, Price{
    @Value("${intSolder}")
    private int number;
    Guns akm = Guns.AKM;
    Grenade pgo = Grenade.PGO;

    @Override
    public double damage() {
        return akm.damage() + pgo.damage() * number;
    }

    @Override
    public int getPrice() {
        return akm.getPrice() + pgo.getPrice()*number;
    }

    @Override
    public double getWeight() {
        return akm.getWeight() + pgo.getWeight()*number;
    }
}
