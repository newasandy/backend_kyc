package org.acme.dto.dtoMapper;

import org.acme.dto.FamilyDetailsDTO;
import org.acme.dto.RelationTypeDTO;
import org.acme.model.AddressDetails;
import org.acme.model.Customer;
import org.acme.model.FamilyDetails;
import org.acme.model.RelationType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyRelationDTOMapper {

    public static List<RelationTypeDTO> relationTypeEntityToDTO(List<RelationType> relationTypesList){
        if (relationTypesList.isEmpty())return Collections.emptyList();
        return relationTypesList.stream().map(RelationTypeDTO::new).collect(Collectors.toList());
    }

    public static RelationTypeDTO toRelationTypeDTO(RelationType relationType){
        RelationTypeDTO relationTypeDTO = new RelationTypeDTO();
        relationTypeDTO.setId(relationType.getId());
        relationTypeDTO.setRelation(relationType.getRelation());
        return relationTypeDTO;
    }

    public static RelationType relationTypeDTOtoEntity(RelationTypeDTO relationTypeDTO){
        RelationType relationType = new RelationType();
        relationType.setId(relationTypeDTO.getId());
        relationType.setRelation(relationTypeDTO.getRelation());
        return relationType;
    }

    public static List<FamilyDetailsDTO> familyDetailsListEntityToDTOList(List<FamilyDetails> familyDetails){
        return familyDetails.stream().map(FamilyDetailsDTO::new).collect(Collectors.toList());
    }

    public static FamilyDetails familyDetailsDTOtoEntity(FamilyDetailsDTO familyDetailsDTO, Customer customer, RelationType relationType){
        FamilyDetails familyDetails = new FamilyDetails();
        familyDetails.setCustomerId(customer);
        familyDetails.setFullName(familyDetailsDTO.getFullName());
        familyDetails.setRelationTypeId(relationType);
        return familyDetails;
    }

}
