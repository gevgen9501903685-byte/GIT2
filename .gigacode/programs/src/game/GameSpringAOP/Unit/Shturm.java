package GameSpringAOP.Unit;

import GameSpringAOP.Propertis.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shturm implements Damage, Weight, Price {
    @Value("${intShturm}")
    private int number;
    Guns akm = Guns.AKM105;
    Grenade pgh = Grenade.PGH;

    @Override
    public double damage() {
        return akm.damage() + pgh.damage() * number;
    }

    @Override
    public int getPrice() {
        return akm.getPrice() + pgh.getPrice()*number;
    }

    @Override
    public double getWeight() {
        return akm.getWeight() + pgh.getWeight()*number;
    }

}
