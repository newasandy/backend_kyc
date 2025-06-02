package org.acme.dto.dtoMapper;

import org.acme.dto.CustomerKycDTO;
import org.acme.model.CustomerKyc;

public class CustomerKycDTOMapper {
    public static CustomerKycDTO customerKycEntityToDTO(CustomerKyc customerKyc){
        return new CustomerKycDTO(customerKyc);
    }

    public static CustomerKyc customerKycDTOtoEntity(CustomerKycDTO customerKycDTO){
        CustomerKyc customerKyc = new CustomerKyc();
        customerKyc.setStatus(customerKycDTO.isStatus());
        return customerKyc;
    }
}
