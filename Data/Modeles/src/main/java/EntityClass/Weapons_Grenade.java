package EntityClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "weapons_grenade", schema = "public")
public class Weapons_Grenade extends IdClass<Integer> {

    private double armor_penetration;

    private double weight;

}

