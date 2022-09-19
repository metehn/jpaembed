package embed.test;

import embed.entity.Address;
import embed.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

public class CustomerPersist {

    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbedPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Customer customer = new Customer();
        customer.setCustomerName("Metehan Ersoy");

        Address address = new Address();
        address.setProvinceName("Manisa");
        address.setDistrictName("Akhisar");
        address.setAddressLine1("Java Cad.");
        address.setAddressLine2("Hibernate Sok.");

        customer.setAddress(address);

        entityManager.getTransaction().begin();

        entityManager.persist(customer);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
