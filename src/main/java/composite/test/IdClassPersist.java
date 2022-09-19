package composite.test;

import composite.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class IdClassPersist {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbedPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Employee employee = new Employee(0,"Employee1");
        Project project = new Project(0, "Project1");



        entityManager.getTransaction().begin();

        entityManager.persist(employee);
        entityManager.persist(project);

        entityManager.getTransaction().commit();


        Director director = new Director(employee.getEmployeeId(), project.getProjectId(), "Engineer");

        entityManager.getTransaction().begin();

        entityManager.persist(director);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
