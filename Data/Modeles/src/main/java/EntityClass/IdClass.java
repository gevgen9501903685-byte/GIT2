package EntityClass;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;

@MappedSuperclass
@Setter
@Getter
public class IdClass <T extends Serializable> {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private T id;

    @NonNull
    private String name;

    private double  damage;

    private Integer  price;
}
