package EntityClass;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="Test",schema = "public")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String name2;
   

    public TestEntity(String name, String name2) {
        this.name = name;
        this.name2 = name2;
    }

}
