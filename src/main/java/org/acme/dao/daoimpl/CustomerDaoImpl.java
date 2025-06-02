package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.CustomerDao;
import org.acme.model.Customer;


@ApplicationScoped
public class CustomerDaoImpl extends BaseDaoImpl<Customer, Long> implements CustomerDao {
    public CustomerDaoImpl() {
        // Required by Quarkus CDI
        super(Customer.class, null); // or pass a dummy/null EM; be cautious if BaseDaoImpl uses it immediately
    }

    @Inject
    public CustomerDaoImpl(EntityManager entityManager) {
        super(Customer.class, entityManager);
    }
}
