package EntityClass;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Weapons_RPG extends IdClass<Integer>{

    private double armor_penetration;

    private double weight;


}
