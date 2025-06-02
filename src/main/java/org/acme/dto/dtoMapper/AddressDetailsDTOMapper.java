package org.acme.dto.dtoMapper;

import org.acme.dto.AddressDetailsDTO;
import org.acme.model.AddressDetails;

public class AddressDetailsDTOMapper {
    public static AddressDetailsDTO addressEntityToDTO(AddressDetails addressDetails){
        return new AddressDetailsDTO(addressDetails);
    }
}
