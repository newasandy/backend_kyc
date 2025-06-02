package org.acme.dto.dtoMapper;

import org.acme.dto.CustomerDTO;
import org.acme.dto.CustomerKycDTO;
import org.acme.model.Customer;
import org.acme.model.CustomerKyc;

public class CustomerKycDTOMapper {
    public static CustomerKycDTO customerKycEntityToDTO(CustomerKyc customerKyc){
        return new CustomerKycDTO(customerKyc);
    }

//    public static CustomerKyc customerKycDTOtoEntity(CustomerKycDTO customerKycDTO, Customer customer){
//        CustomerKyc customerKyc = new CustomerKyc();
//        customerKyc.setCustomerId(customer);
//        customerKyc.setStatus(customerKycDTO.isStatus());
//        return customerKyc;
//    }
}
