package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.AddressDetailsDao;
import org.acme.model.AddressDetails;

@ApplicationScoped
public class AddressDetailsDaoImpl extends BaseDaoImpl<AddressDetails,Long> implements AddressDetailsDao {

    public AddressDetailsDaoImpl(){
        super(AddressDetails.class,null);
    }

    @Inject
    public AddressDetailsDaoImpl(EntityManager entityManager){
        super(AddressDetails.class,entityManager);
    }
}
