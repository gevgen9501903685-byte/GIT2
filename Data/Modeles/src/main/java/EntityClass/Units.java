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
@Table(name="units",schema = "public")
public class Units extends IdClass<Integer> {

    private Integer healht;
 
    private double weight_max;

    private Integer ammunition;


}
