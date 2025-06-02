package org.acme.dto.dtoMapper;

import org.acme.dto.DistrictDTO;
import org.acme.dto.LocalLevelDTO;
import org.acme.dto.ProvinceDTO;
import org.acme.model.District;
import org.acme.model.LocalLevel;
import org.acme.model.Province;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LocationDTOMapper {

    public static List<ProvinceDTO> provinceEntityToDTO(List<Province> provinceList){

        if (provinceList.isEmpty())return Collections.emptyList();

        return provinceList.stream().map(ProvinceDTO::new).collect(Collectors.toList());
    }

    public static List<DistrictDTO> districtEntityToDTO(List<District> districtsList){
        if (districtsList.isEmpty())return Collections.emptyList();
        return districtsList.stream().map(DistrictDTO::new).collect(Collectors.toList());
    }

    public static List<LocalLevelDTO> localLevelEntityToDTO(List<LocalLevel> localLevelList){
        if (localLevelList.isEmpty())return Collections.emptyList();
        return localLevelList.stream().map(LocalLevelDTO::new).collect(Collectors.toList());
    }
}
