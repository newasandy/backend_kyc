package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import org.acme.dao.CustomerDao;
import org.acme.model.Customer;


@ApplicationScoped
public class CustomerDaoImpl extends BaseDaoImpl<Customer, Long> implements CustomerDao {
    public CustomerDaoImpl() {
        super(Customer.class, null);
    }

    @Inject
    public CustomerDaoImpl(EntityManager entityManager) {
        super(Customer.class, entityManager);
    }

    @Override
    public Customer getByIdentityDetails(String identityNumber) {
        try{
        return entityManager.createQuery("SELECT c FROM Customer c JOIN IdentityDetails id ON id.customerId.id = c.id WHERE id.identityNumber = :identityNumber",Customer.class)
                .setParameter("identityNumber",identityNumber)
                .getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }
}
