package composite.test;

import composite.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JoinColumnsTest {

    public static void main(String[] args) {

        long employeeId = 2;
        long projectId = 2;

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbedPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        ParticipantId participantId = new ParticipantId(employeeId, projectId);
        Participant participant = entityManager.find(Participant.class, participantId);

        DirectorId directorId = new DirectorId(employeeId, projectId);
        Director director = entityManager.find(Director.class, directorId);

        Task task = new Task(0,"DenemeTask",participant, director);

        entityManager.getTransaction().begin();

        entityManager.persist(task);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
