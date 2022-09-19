package embed.test;

import embed.entity.Address;
import embed.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CustomerFind {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbedPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        long customerId = 1;



        Customer customer = entityManager.find(Customer.class, customerId);

        entityManager.close();

        System.out.println(customer.getCustomerId()
                + " " + customer.getCustomerName()
                + " " + customer.getAddress().getProvinceName()
                + " " + customer.getAddress().getDistrictName());


    }


}
