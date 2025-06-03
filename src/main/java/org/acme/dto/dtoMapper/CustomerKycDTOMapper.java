package org.acme.dto.dtoMapper;

import org.acme.dto.CustomerDTO;
import org.acme.dto.CustomerKycDTO;
import org.acme.model.Customer;
import org.acme.model.CustomerKyc;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerKycDTOMapper {
    public static CustomerKycDTO customerKycEntityToDTO(CustomerKyc customerKyc){
        return new CustomerKycDTO(customerKyc);
    }

    public static List<CustomerDTO> getCustomerList(List<Customer> customerList){
        return customerList.stream().map(CustomerDTO::new).collect(Collectors.toList());
    }

//    public static CustomerKyc customerKycDTOtoEntity(CustomerKycDTO customerKycDTO, Customer customer){
//        CustomerKyc customerKyc = new CustomerKyc();
//        customerKyc.setCustomerId(customer);
//        customerKyc.setStatus(customerKycDTO.isStatus());
//        return customerKyc;
//    }
}
