package org.acme.dao.daoimpl;

import jakarta.persistence.EntityManager;
import org.acme.dao.BaseDao;

import jakarta.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public abstract class   BaseDaoImpl<T, ID extends Serializable> implements BaseDao<T, ID> {

    protected final EntityManager entityManager;
    private final Class<T> entityClass;

    public BaseDaoImpl(Class<T> entityClass, EntityManager entityManager) {
        this.entityClass = entityClass;
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public boolean save(T entity) {
        try {
            entityManager.persist(entity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public T findById(ID id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        String query = "SELECT e FROM " + entityClass.getSimpleName() + " e";
        return entityManager.createQuery(query, entityClass).getResultList();
    }

    @Override
    @Transactional
    public boolean update(T entity) {
        try {
            entityManager.merge(entity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    @Transactional
    public boolean deleteById(ID id) {
        try {
            T entity = findById(id);
            if (entity != null) {
                entityManager.remove(entity);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
