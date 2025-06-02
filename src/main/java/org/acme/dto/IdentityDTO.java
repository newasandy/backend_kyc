package org.acme.dto;

import org.acme.model.DocumentType;
import org.acme.model.IdentityDetails;

import java.time.LocalDate;

public class IdentityDTO {
    private Long id;
    private Long customer_id;
    private DocumentType documentType;
    private String nationality;
    private String birthPlace;
    private String placeOfIssue;
    private String identityNumber;
    private LocalDate issueDate;
    private String authority;

    public IdentityDTO(){

    }

    public IdentityDTO(IdentityDetails identityDetails){
        this.id = identityDetails.getId();
        this.customer_id = identityDetails.getCustomerId().getId();
        this.documentType = identityDetails.getDocumentType();
        this.nationality = identityDetails.getNationality();
        this.birthPlace = identityDetails.getBirthPlace();
        this.placeOfIssue = identityDetails.getPlaceOfIssue();
        this.identityNumber = identityDetails.getIdentityNumber();
        this.issueDate = identityDetails.getIssueDate();
        this.authority = identityDetails.getAuthority();
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
