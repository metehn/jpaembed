package embed.test;

import embed.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class CustomerQuery {


    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbedPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        String districtName = "Akhisar";

        String jpql = "select customer from Customer as customer "
                + " where customer.address.districtName = :districtName";
        TypedQuery<Customer> query = entityManager.createQuery(jpql, Customer.class);
        query.setParameter("districtName", districtName);
        List<Customer> customerList = query.getResultList();

        entityManager.close();

        for(Customer customer : customerList){

            System.out.println(customer.getCustomerId()
                    + " " + customer.getCustomerName()
                    + " " + customer.getAddress().getProvinceName()
                    + " " + customer.getAddress().getDistrictName());
        }





    }


}
