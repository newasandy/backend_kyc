package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.acme.dao.LocalLevelDao;
import org.acme.model.LocalLevel;

import java.util.List;

@ApplicationScoped
public class LocalLevelDaoImpl extends BaseDaoImpl<LocalLevel,Long>implements LocalLevelDao {

    public LocalLevelDaoImpl(){
        super(LocalLevel.class,null);
    }

    @Inject
    public LocalLevelDaoImpl(EntityManager entityManager){
        super(LocalLevel.class,entityManager);
    }

    @Override
    public List<LocalLevel> localLevelList(Long id) {
        TypedQuery<LocalLevel> query = entityManager.createQuery(
                "SELECT d FROM LocalLevel d WHERE d.district.id = :districtID", LocalLevel.class
        );
        query.setParameter("districtID", id);
        return query.getResultList();
    }
}
