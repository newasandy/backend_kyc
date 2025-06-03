package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dto.AddressDetailsDTO;
import org.acme.dto.dtoMapper.AddressDetailsDTOMapper;
import org.acme.model.*;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class AddressService {

    public List<AddressDetails> getCustomerAddress (List<AddressDetailsDTO> addressDetailsDTOList , Customer customer){
        List<AddressDetails> addressDetailsList = new ArrayList<>();
        for (AddressDetailsDTO addressDetailsDTO : addressDetailsDTOList){
            addressDetailsList.add(AddressDetailsDTOMapper.addressDTOtoEntity(addressDetailsDTO,customer));
        }
        return addressDetailsList;
    }
}
