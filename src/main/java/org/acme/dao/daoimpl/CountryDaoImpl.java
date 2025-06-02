package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.CountryDao;
import org.acme.model.Country;

@ApplicationScoped
public class CountryDaoImpl extends BaseDaoImpl<Country,Long> implements CountryDao {
    public CountryDaoImpl(){
        super(Country.class, null);
    }

    @Inject
    public CountryDaoImpl(EntityManager entityManager){
        super(Country.class,entityManager);
    }
}
