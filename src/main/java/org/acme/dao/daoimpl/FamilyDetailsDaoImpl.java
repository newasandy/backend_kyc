package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.FamilyDetailsDao;
import org.acme.model.FamilyDetails;

@ApplicationScoped
public class FamilyDetailsDaoImpl extends BaseDaoImpl<FamilyDetails,Long>implements FamilyDetailsDao {

    public FamilyDetailsDaoImpl(){
        super(FamilyDetails.class,null);
    }

    @Inject
    public FamilyDetailsDaoImpl(EntityManager entityManager){
        super(FamilyDetails.class,entityManager);
    }
}
