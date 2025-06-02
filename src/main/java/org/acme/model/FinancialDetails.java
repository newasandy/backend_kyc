package org.acme.model;


import jakarta.persistence.*;

@Entity
@Table(name = "financial_details")
public class FinancialDetails extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customerId;

    @Column(name = "education",nullable = false, length = 100)
    private String education;

    @Column(name = "occupation", nullable = false, length = 100)
    private String occupation;

    @Column(name = "designation", nullable = false, length = 100)
    private String designation;

    @Column(name = "employment_type", nullable = false, length = 100)
    private String employmentType;

    @Column(name = "source_of_income", nullable = false, length = 100)
    private String sourceOfIncome;

    @Column(name = "annual_income", nullable = false)
    private double annualIncome;

    @Column(name = "annual_transaction_volume", nullable = false)
    private double annualTransactionVolume;

    public FinancialDetails() {
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
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
