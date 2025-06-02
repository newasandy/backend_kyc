package org.acme.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(name = "salutation",nullable = false,length = 50)
    private Salutation salutation;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "middle_name", length = 100)
    private String middle_name;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "gender", nullable = false, length = 25)
    private String gender;

    @Column(name = "phone_number", nullable = false)
    private Long phoneNumber;

    @Column(name = "mobile_number",nullable = false)
    private Long mobileNumber;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "marital_status", nullable = false)
    private boolean maritalStatus;

    @OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL)
    private List<AddressDetails> addressDetails;

    @OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
    private List<FamilyDetails> familyDetails;

    @OneToOne(mappedBy = "customerId", cascade = CascadeType.ALL)
    private IdentityDetails identityDetails;

    @OneToOne(mappedBy = "customerId", cascade = CascadeType.ALL)
    private FinancialDetails financialDetails;

    @OneToOne(mappedBy = "customerId" , cascade = CascadeType.ALL)
    private CustomerKyc customerKyc;

    public Customer() {
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

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
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

    public List<AddressDetails> getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(List<AddressDetails> addressDetails) {
        this.addressDetails = addressDetails;
    }

    public List<FamilyDetails> getFamilyDetails() {
        return familyDetails;
    }

    public void setFamilyDetails(List<FamilyDetails> familyDetails) {
        this.familyDetails = familyDetails;
    }

    public IdentityDetails getIdentityDetails() {
        return identityDetails;
    }

    public void setIdentityDetails(IdentityDetails identityDetails) {
        this.identityDetails = identityDetails;
    }

    public FinancialDetails getFinancialDetails() {
        return financialDetails;
    }

    public void setFinancialDetails(FinancialDetails financialDetails) {
        this.financialDetails = financialDetails;
    }

    public CustomerKyc getCustomerKyc() {
        return customerKyc;
    }

    public void setCustomerKyc(CustomerKyc customerKyc) {
        this.customerKyc = customerKyc;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
