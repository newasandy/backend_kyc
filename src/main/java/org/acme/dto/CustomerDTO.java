package org.acme.dto;

import org.acme.dto.dtoMapper.*;
import org.acme.model.Customer;
import org.acme.model.Salutation;

import java.time.LocalDate;
import java.util.List;

public class CustomerDTO {
    private Long id;
    private Salutation salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private Long phoneNumber;
    private Long mobileNumber;
    private String email;
    private boolean maritalStatus;
    private List<AddressDetailsDTO> addressDetails;
    private List<FamilyDetailsDTO> familyDetails;
    private IdentityDTO identityDetails;
    private FinancialDetailsDTO financialDetails;
    private CustomerKycDTO customerKyc;

    public CustomerDTO() {
    }

    public CustomerDTO(Customer customer){
        this.id = customer.getId();
        this.salutation = customer.getSalutation();
        this.firstName = customer.getFirstName();
        this.middleName = customer.getMiddleName();
        this.lastName = customer.getLastName();
        this.dateOfBirth = customer.getDateOfBirth();
        this.gender = customer.getGender();
        this.phoneNumber = customer.getPhoneNumber();
        this.mobileNumber = customer.getMobileNumber();
        this.maritalStatus = customer.isMaritalStatus();
        this.addressDetails = AddressDetailsDTOMapper.addressEntityListToDTOList(customer.getAddressDetails());
        this.familyDetails = FamilyRelationDTOMapper.familyDetailsListEntityToDTOList(customer.getFamilyDetails());
        this.identityDetails = IdentityDetailsDTOMapper.toDTO(customer.getIdentityDetails());
        this.financialDetails = FinancialDetailsDTOMapper.financialEntityToDTO(customer.getFinancialDetails());
        this.customerKyc = CustomerKycDTOMapper.customerKycEntityToDTO(customer.getCustomerKyc());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public List<AddressDetailsDTO> getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(List<AddressDetailsDTO> addressDetails) {
        this.addressDetails = addressDetails;
    }

    public List<FamilyDetailsDTO> getFamilyDetails() {
        return familyDetails;
    }

    public void setFamilyDetails(List<FamilyDetailsDTO> familyDetails) {
        this.familyDetails = familyDetails;
    }

    public IdentityDTO getIdentityDetails() {
        return identityDetails;
    }

    public void setIdentityDetails(IdentityDTO identityDetails) {
        this.identityDetails = identityDetails;
    }

    public FinancialDetailsDTO getFinancialDetails() {
        return financialDetails;
    }

    public void setFinancialDetails(FinancialDetailsDTO financialDetails) {
        this.financialDetails = financialDetails;
    }

    public CustomerKycDTO getCustomerKyc() {
        return customerKyc;
    }

    public void setCustomerKyc(CustomerKycDTO customerKyc) {
        this.customerKyc = customerKyc;
    }
}
