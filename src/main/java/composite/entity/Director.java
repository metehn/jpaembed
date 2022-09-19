package composite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(DirectorId.class) //@EmbeddedId demeden idleri hangi sınıftan alacağını söyledik
public class Director {
    @Id
    private long employeeId;
    @Id
    private long projectId;
    private String directoryTitle;
}
