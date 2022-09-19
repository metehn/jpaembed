package composite.test;

import composite.entity.Employee;
import composite.entity.Participant;
import composite.entity.ParticipantId;
import composite.entity.Project;
import embed.entity.Address;
import embed.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmbeddedIdPersist {


    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbedPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Employee employee = new Employee(0,"Employee1");
        Project project = new Project(0, "Project1");



        entityManager.getTransaction().begin();

        entityManager.persist(employee);
        entityManager.persist(project);

        entityManager.getTransaction().commit();


        ParticipantId participantId = new ParticipantId(employee.getEmployeeId(), project.getProjectId());
        Participant participant = new Participant(participantId, "Engineer");

        entityManager.getTransaction().begin();

        entityManager.persist(participant);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
