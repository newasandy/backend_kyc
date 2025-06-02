package org.acme.dto.dtoMapper;

import org.acme.dto.CountryDTO;
import org.acme.dto.DistrictDTO;
import org.acme.dto.LocalLevelDTO;
import org.acme.dto.ProvinceDTO;
import org.acme.model.Country;
import org.acme.model.District;
import org.acme.model.LocalLevel;
import org.acme.model.Province;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LocationDTOMapper {

    public static List<ProvinceDTO> provinceEntityListToDTOList(List<Province> provinceList){
        if (provinceList.isEmpty())return Collections.emptyList();
        return provinceList.stream().map(ProvinceDTO::new).collect(Collectors.toList());
    }

    public static List<DistrictDTO> districtEntityListToDTOList(List<District> districtsList){
        if (districtsList.isEmpty())return Collections.emptyList();
        return districtsList.stream().map(DistrictDTO::new).collect(Collectors.toList());
    }

    public static List<LocalLevelDTO> localLevelEntityListToDTOList(List<LocalLevel> localLevelList){
        if (localLevelList.isEmpty())return Collections.emptyList();
        return localLevelList.stream().map(LocalLevelDTO::new).collect(Collectors.toList());
    }
    public static CountryDTO countryEntityToDTO(Country country){
        return new CountryDTO(country);
    }

    public static ProvinceDTO provinceEntityToDTO(Province province){
        return new ProvinceDTO(province);
    }

    public static DistrictDTO districtEntityToDTO(District district){
        return new DistrictDTO(district);
    }

    public static LocalLevelDTO localLevelEntityToDTO(LocalLevel localLevel){
        return new LocalLevelDTO(localLevel);
    }

    public static Country countryDTOtoEntity(CountryDTO countryDTO){
        Country country = new Country();
        country.setId(countryDTO.getId());
        country.setCountry(countryDTO.getCountry());
        return country;
    }

    public static Province provinceDTOtoEntity(ProvinceDTO provinceDTO){
        Province province = new Province();
        province.setId(provinceDTO.getId());
        province.setProvince(provinceDTO.getProvince());

        return province;
    }

    public static District districtDTOtoEntity(DistrictDTO districtDTO){
        District district = new District();
        district.setId(districtDTO.getId());
        district.setDistrict(districtDTO.getDistrict());

        return district;
    }

    public static LocalLevel localLevelDTOtoEntity(LocalLevelDTO localLevelDTO){
        LocalLevel localLevel = new LocalLevel();
        localLevel.setId(localLevelDTO.getId());
        localLevel.setLocalLevel(localLevelDTO.getLocalLevel());

        return localLevel;
    }

}
