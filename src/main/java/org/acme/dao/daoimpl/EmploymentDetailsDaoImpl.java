package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.EmploymentDetailsDao;
import org.acme.model.FinancialDetails;

@ApplicationScoped
public class EmploymentDetailsDaoImpl extends BaseDaoImpl<FinancialDetails,Long> implements EmploymentDetailsDao {

    public EmploymentDetailsDaoImpl(){
        super(FinancialDetails.class,null);
    }

    @Inject
    public EmploymentDetailsDaoImpl(EntityManager entityManager){
        super(FinancialDetails.class,entityManager);
    }
}
