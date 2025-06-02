package org.acme.dao;

import org.acme.model.District;
import org.acme.model.Province;

import java.util.List;

public interface DistrictDao extends BaseDao<District,Long> {
    List<District> districtList(Long id);
}
