package org.acme.dto;

import org.acme.dto.dtoMapper.FamilyRelationDTOMapper;
import org.acme.model.FamilyDetails;

public class FamilyDetailsDTO {

    private Long id;
    private String fullName;
    private Long customer;
    private Long relationType;

    public FamilyDetailsDTO() {
    }
    public FamilyDetailsDTO(FamilyDetails familyDetails) {
        this.id = familyDetails.getId();
        this.fullName = familyDetails.getFullName();
        this.relationType = FamilyRelationDTOMapper.toRelationTypeDTO(familyDetails.getRelationTypeId()).getId();
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

    public Long getRelationType() {
        return relationType;
    }

    public void setRelationType(Long relationTypeId) {
        this.relationType = relationTypeId;
    }
}
