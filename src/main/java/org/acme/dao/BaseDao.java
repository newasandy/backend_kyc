package org.acme.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T, ID extends Serializable> {
    boolean save(T entity);
    T findById(ID id);
    List<T> findAll();
    boolean update(T entity);
    boolean deleteById(ID id);
}