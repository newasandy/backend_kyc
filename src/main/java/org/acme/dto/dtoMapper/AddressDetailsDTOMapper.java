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

    public static AddressDetails addressDTOtoEntity(AddressDetailsDTO addressDetailsDTO, Customer customer, Country country, Province province, District district, LocalLevel localLevel){
        AddressDetails addressDetails = new AddressDetails();
        addressDetails.setId(addressDetailsDTO.getId());
        addressDetails.setCustomerId(customer);
        addressDetails.setCountryId(country);
        addressDetails.setProvinceId(province);
        addressDetails.setDistrictId(district);
        addressDetails.setLocalLevelId(localLevel);
        addressDetails.setTole(addressDetailsDTO.getTole());
        addressDetails.setWard(addressDetailsDTO.getWard());
        addressDetails.setHouseNumber(addressDetailsDTO.getHouseNumber());
        addressDetails.setAddressType(addressDetailsDTO.getAddressType());
        return addressDetails;
    }

}
