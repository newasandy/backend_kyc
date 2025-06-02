package org.acme.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "identity_details")
public class IdentityDetails extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customerId;

    @Enumerated(EnumType.STRING)
    @Column(name ="document_type",nullable = false)
    private DocumentType documentType;

    @Column(name = "nationality",nullable = false)
    private String nationality;

    @Column(name = "birth_place",nullable = false)
    private String birthPlace;

    @Column(name = "place_of_issue",nullable = false)
    private String placeOfIssue;

    @Column(name = "identity_number", nullable = false,unique = true)
    private String identityNumber;

    @Column(name = "issue_date", nullable = false)
    private LocalDate issueDate;

    @Column(name = "authority", nullable = false)
    private String authority;

    public IdentityDetails() {
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
