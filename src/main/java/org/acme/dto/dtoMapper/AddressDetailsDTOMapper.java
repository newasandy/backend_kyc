package org.acme.dto.dtoMapper;

import org.acme.dto.AddressDetailsDTO;
import org.acme.model.*;

import java.util.List;
import java.util.stream.Collectors;

public class AddressDetailsDTOMapper {
    public static AddressDetailsDTO addressEntityToDTO(AddressDetails addressDetails){
        return new AddressDetailsDTO(addressDetails);
    }

    public static List<AddressDetailsDTO> addressEntityListToDTOList(List<AddressDetails> addressDetails){
        return addressDetails.stream().map(AddressDetailsDTO::new).collect(Collectors.toList());
    }

    public static AddressDetails addressDTOtoEntity(AddressDetailsDTO addressDetailsDTO, Customer customer){
        AddressDetails addressDetails = new AddressDetails();
        addressDetails.setId(addressDetailsDTO.getId());
        addressDetails.setCustomerId(customer);

        addressDetails.setTole(addressDetailsDTO.getTole());
        addressDetails.setWard(addressDetailsDTO.getWard());
        addressDetails.setHouseNumber(addressDetailsDTO.getHouseNumber());
        addressDetails.setAddressType(addressDetailsDTO.getAddressType());

        Country country1 = LocationDTOMapper.countryDTOtoEntity(addressDetailsDTO.getCountryId());
        Province province1 = LocationDTOMapper.provinceDTOtoEntity(addressDetailsDTO.getProvinceId());
        District district1 = LocationDTOMapper.districtDTOtoEntity(addressDetailsDTO.getDistrictId());
        LocalLevel localLevel1 = LocationDTOMapper.localLevelDTOtoEntity(addressDetailsDTO.getLocalLevelId());

        addressDetails.setCountryId(country1);
        addressDetails.setProvinceId(province1);
        addressDetails.setDistrictId(district1);
        addressDetails.setLocalLevelId(localLevel1);

        return addressDetails;
    }

}
