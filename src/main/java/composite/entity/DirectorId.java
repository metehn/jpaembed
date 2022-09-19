package composite.entity;

import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DirectorId implements Serializable {
//Bu sınıftaki değerlerin hepsi databaseye primary key olarak yazılıyor!
    private long employeeId;
    private long projectId;
}
