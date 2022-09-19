package composite.test;

import composite.entity.Director;
import composite.entity.DirectorId;
import composite.entity.Participant;
import composite.entity.ParticipantId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class IdClassFind {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbedPersistenceUnit");
        EntityManager entityManager = factory.createEntityManager();

        long employeeId = 8;
        long projectId = 8;

        DirectorId directoryId = new DirectorId(employeeId, projectId);
        Director director = entityManager.find(Director.class, directoryId);

        entityManager.close();

        System.out.println(director.getEmployeeId()
                + " " + director.getProjectId()
                + " " + director.getDirectoryTitle());


    }

}
