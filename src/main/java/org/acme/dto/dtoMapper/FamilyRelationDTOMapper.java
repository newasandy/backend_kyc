package org.acme.dto.dtoMapper;

import org.acme.dto.RelationTypeDTO;
import org.acme.model.RelationType;

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
}
