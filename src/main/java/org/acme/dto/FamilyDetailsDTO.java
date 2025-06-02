package org.acme.dto;

import org.acme.dto.dtoMapper.FamilyRelationDTOMapper;
import org.acme.model.FamilyDetails;

public class FamilyDetailsDTO {

    private Long id;
    private String fullName;
    private Long customer;
    private RelationTypeDTO relationType;

    public FamilyDetailsDTO() {
    }
    public FamilyDetailsDTO(FamilyDetails familyDetails) {
        this.id = familyDetails.getId();
        this.fullName = familyDetails.getFullName();
        this.customer = familyDetails.getCustomerId().getId();
        this.relationType = FamilyRelationDTOMapper.toRelationTypeDTO(familyDetails.getRelationTypeId());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getCustomer() {
        return customer;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public RelationTypeDTO getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationTypeDTO relationType) {
        this.relationType = relationType;
    }
}
