package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import org.acme.dao.DistrictDao;
import org.acme.model.District;
import java.util.List;

@ApplicationScoped
public class DistrictDaoImpl extends BaseDaoImpl<District,Long>implements DistrictDao {

    public DistrictDaoImpl(){
        super(District.class,null);
    }

    @Inject
    public DistrictDaoImpl(EntityManager entityManager){
        super(District.class,entityManager);
    }


    @Override
    public List<District> districtList(Long id) {
        try{
            return entityManager.createQuery("SELECT e FROM District e WHERE e.provinceId.id = :provinceId", District.class)
                    .setParameter("provinceId",id)
                    .getResultList();
        }catch (NoResultException e){
            return null;
        }
    }

}
