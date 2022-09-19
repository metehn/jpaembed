package composite.test;

import composite.entity.Participant;
import composite.entity.ParticipantId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmbeddedIdFind {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbedPersistenceUnit");
        EntityManager entityManager = factory.createEntityManager();

        long employeeId = 1;
        long projectId = 1;

        ParticipantId participantId = new ParticipantId(employeeId, projectId);
        Participant participant = entityManager.find(Participant.class, participantId);

        entityManager.close();

        System.out.println(participant.getParticipantId() + " " + participant.getRoleName());


    }
}
