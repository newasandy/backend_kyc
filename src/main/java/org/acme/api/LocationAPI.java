package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.dao.DistrictDao;
import org.acme.dao.LocalLevelDao;
import org.acme.dao.ProvinceDao;
import org.acme.dto.DistrictDTO;
import org.acme.dto.LocalLevelDTO;
import org.acme.dto.ProvinceDTO;
import org.acme.dto.dtoMapper.LocationDTOMapper;
import org.acme.model.District;
import org.acme.model.LocalLevel;
import org.acme.model.Province;

import java.util.List;

@Path("/location")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LocationAPI {

    @Inject
    private ProvinceDao provinceDao;

    @Inject
    private DistrictDao districtDao;

    @Inject
    private LocalLevelDao localLevelDao;

    @POST
    @Path("/province")
    public List<ProvinceDTO> provinces(){
        List<Province> provinceList = provinceDao.findAll();
        return LocationDTOMapper.provinceEntityToDTO(provinceList);
    }

    @POST
    @Path("/district/{id}")
    public List<DistrictDTO> districts(@PathParam("id") Long id){
        List<District> districtList = districtDao.districtList(id);
        return LocationDTOMapper.districtEntityToDTO(districtList);
    }

    @POST
    @Path("/locallevel/{id}")
    public List<LocalLevelDTO> localLevel(@PathParam("id") Long id){
        List<LocalLevel> localLevelList = localLevelDao.localLevelList(id);
        return LocationDTOMapper.localLevelEntityToDTO(localLevelList);
    }

}
