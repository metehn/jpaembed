package composite.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant {

    @EmbeddedId
    private ParticipantId participantId;
    private String roleName;

}
