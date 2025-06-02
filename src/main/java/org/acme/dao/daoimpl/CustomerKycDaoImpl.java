package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.CustomerKycDao;
import org.acme.model.CustomerKyc;

@ApplicationScoped
public class CustomerKycDaoImpl extends BaseDaoImpl<CustomerKyc, Long> implements CustomerKycDao {

    public CustomerKycDaoImpl(){
        super(CustomerKyc.class,null);
    }

    @Inject
    public CustomerKycDaoImpl(EntityManager entityManager){
        super(CustomerKyc.class,entityManager);
    }
}
