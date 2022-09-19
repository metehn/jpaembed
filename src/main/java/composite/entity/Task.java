package composite.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taskId;
    private String taskName;

    @ManyToOne @JoinColumns({
            @JoinColumn(name = "projectIdParticipant", referencedColumnName = "projectId"),
            @JoinColumn(name = "employeeIdParticipant", referencedColumnName = "employeeId")
    })
    private Participant participant;

    @ManyToOne  @JoinColumns({
            @JoinColumn(name = "projectIdDirector", referencedColumnName = "projectId"),
            @JoinColumn(name = "employeeIdDirector", referencedColumnName = "employeeId")
    })
    private Director director;
}
