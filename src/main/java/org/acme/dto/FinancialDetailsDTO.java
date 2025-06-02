package org.acme.dto;

import org.acme.model.FinancialDetails;

public class FinancialDetailsDTO {
    private Long id;
    private Long customerId;
    private String education;
    private String occupation;
    private String designation;
    private String employmentType;
    private String sourceOfIncome;
    private double annualIncome;
    private double annualTransactionVolume;

    public FinancialDetailsDTO() {
    }
    public FinancialDetailsDTO(FinancialDetails financialDetails) {
        this.id = financialDetails.getId();
        this.customerId = financialDetails.getCustomerId().getId();
        this.education = financialDetails.getEducation();
        this.occupation = financialDetails.getOccupation();
        this.designation = financialDetails.getDesignation();
        this.employmentType = financialDetails.getEmploymentType();
        this.sourceOfIncome = financialDetails.getSourceOfIncome();
        this.annualIncome = financialDetails.getAnnualIncome();
        this.annualTransactionVolume = financialDetails.getAnnualTransactionVolume();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getAnnualTransactionVolume() {
        return annualTransactionVolume;
    }

    public void setAnnualTransactionVolume(double annualTransactionVolume) {
        this.annualTransactionVolume = annualTransactionVolume;
    }
}
