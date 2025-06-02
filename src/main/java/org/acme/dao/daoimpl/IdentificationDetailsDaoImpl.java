package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.IdentificationDetailsDao;
import org.acme.model.IdentityDetails;

@ApplicationScoped
public class IdentificationDetailsDaoImpl extends BaseDaoImpl<IdentityDetails,Long> implements IdentificationDetailsDao {
    public IdentificationDetailsDaoImpl(){
        super(IdentityDetails.class,null);
    }
    @Inject
    public IdentificationDetailsDaoImpl(EntityManager entityManager){
        super(IdentityDetails.class,entityManager);
    }
}
