package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.acme.dao.CustomerDao;
import org.acme.dto.CustomerDTO;
import org.acme.dto.dtoMapper.FinancialDetailsDTOMapper;
import org.acme.dto.dtoMapper.IdentityDetailsDTOMapper;
import org.acme.model.*;

import java.util.List;


@ApplicationScoped
public class CustomerService {

    @Inject
    private CustomerDao customerDao;

    @Inject
    private AddressService addressService;

    @Inject
    private FamilyService familyService;

    @Transactional
    public boolean createNewCustomer(CustomerDTO customerDTO){
        try{
        Customer customer = new Customer();
        customer.setSalutation(customerDTO.getSalutation());
        customer.setFirstName(customerDTO.getFirstName());
        customer.setMiddleName(customerDTO.getMiddleName());
        customer.setLastName(customerDTO.getLastName());
        customer.setDateOfBirth(customerDTO.getDateOfBirth());
        customer.setGender(customerDTO.getGender());
        customer.setPhoneNumber(customerDTO.getPhoneNumber());
        customer.setMobileNumber(customerDTO.getMobileNumber());
        customer.setEmail(customerDTO.getEmail());
        customer.setMaritalStatus(customerDTO.isMaritalStatus());
        List<AddressDetails> customerAddress = addressService.getCustomerAddress(customerDTO.getAddressDetails(),customer);
        customer.setAddressDetails(customerAddress);

        List<FamilyDetails> customerFamily = familyService.getCustomerFamilyDetails(customerDTO.getFamilyDetails(),customer);
        customer.setFamilyDetails(customerFamily);

        FinancialDetails financialDetails = FinancialDetailsDTOMapper.financialDTOtoEntity(customerDTO.getFinancialDetails(),customer);
        customer.setFinancialDetails(financialDetails);

        IdentityDetails identityDetails = IdentityDetailsDTOMapper.identityDetailsDTOtoEntity(customerDTO.getIdentityDetails(),customer);
        customer.setIdentityDetails(identityDetails);

        CustomerKyc customerKyc = new CustomerKyc();
        customerKyc.setCustomerId(customer);
        customerKyc.setStatus(false);

        customer.setCustomerKyc(customerKyc);
        return customerDao.save(customer);

        }catch (Exception e){
            System.err.println(e);
            return false;
        }
    }
    
    
}
