package org.acme.dao;

import org.acme.model.LocalLevel;

import java.util.List;

public interface LocalLevelDao extends BaseDao<LocalLevel,Long> {
    List<LocalLevel> localLevelList(Long id);
}
