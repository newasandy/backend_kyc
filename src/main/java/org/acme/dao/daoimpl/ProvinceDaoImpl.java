package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.ProvinceDao;
import org.acme.model.Province;

@ApplicationScoped
public class ProvinceDaoImpl extends BaseDaoImpl<Province,Long> implements ProvinceDao {

    public ProvinceDaoImpl(){
        super(Province.class,null);
    }
    @Inject
    public ProvinceDaoImpl(EntityManager entityManager){
        super(Province.class,entityManager);
    }
}
