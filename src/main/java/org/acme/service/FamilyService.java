package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.dao.RelationTypeDao;
import org.acme.dto.FamilyDetailsDTO;
import org.acme.dto.dtoMapper.FamilyRelationDTOMapper;
import org.acme.model.Customer;
import org.acme.model.FamilyDetails;
import org.acme.model.RelationType;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class FamilyService {

    @Inject
    private RelationTypeDao relationTypeDao;

    public List<FamilyDetails> getCustomerFamilyDetails(List<FamilyDetailsDTO> familyDetailsDTOList, Customer customer){

        List<FamilyDetails> familyDetailsList = new ArrayList<>();

        for (FamilyDetailsDTO familyDetailsDTO: familyDetailsDTOList){
            familyDetailsList.add(FamilyRelationDTOMapper.familyDetailsDTOtoEntity(familyDetailsDTO,customer,
                    getRelationTypeById(familyDetailsDTO.getRelationType().getId())));
        }
        return familyDetailsList;
    }

    public RelationType getRelationTypeById(Long id){
        return relationTypeDao.findById(id);
    }

}
