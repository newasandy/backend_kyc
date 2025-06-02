package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.dao.CountryDao;
import org.acme.dao.DistrictDao;
import org.acme.dao.LocalLevelDao;
import org.acme.dao.ProvinceDao;
import org.acme.dto.AddressDetailsDTO;
import org.acme.dto.dtoMapper.AddressDetailsDTOMapper;
import org.acme.model.*;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class AddressService {

    @Inject
    private CountryDao countryDao;

    @Inject
    private ProvinceDao provinceDao;

    @Inject
    private DistrictDao districtDao;

    @Inject
    private LocalLevelDao localLevelDao;

    public List<AddressDetails> getCustomerAddress (List<AddressDetailsDTO> addressDetailsDTOList , Customer customer){
        List<AddressDetails> addressDetailsList = new ArrayList<>();

        for (AddressDetailsDTO addressDetailsDTO : addressDetailsDTOList){
            addressDetailsList.add(AddressDetailsDTOMapper.addressDTOtoEntity(addressDetailsDTO,customer,
                    getCountryById(addressDetailsDTO.getCountryId().getId()),
                    getProvinceById(addressDetailsDTO.getProvinceId().getId()),
                    getDistrictById(addressDetailsDTO.getDistrictId().getId()),
                    getLocalLevelById(addressDetailsDTO.getLocalLevelId().getId())));
        }
        return addressDetailsList;
    }

    public Country getCountryById(Long id){
        return countryDao.findById(id);
    }

    public Province getProvinceById(Long id){
        return provinceDao.findById(id);
    }

    public District getDistrictById(Long id){
        return districtDao.findById(id);
    }
    public LocalLevel getLocalLevelById(Long id){
        return localLevelDao.findById(id);
    }
}
