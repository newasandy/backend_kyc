package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dto.FamilyDetailsDTO;
import org.acme.dto.dtoMapper.FamilyRelationDTOMapper;
import org.acme.model.Customer;
import org.acme.model.FamilyDetails;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class FamilyService {

    public List<FamilyDetails> getCustomerFamilyDetails(List<FamilyDetailsDTO> familyDetailsDTOList, Customer customer){
        List<FamilyDetails> familyDetailsList = new ArrayList<>();
        for (FamilyDetailsDTO familyDetailsDTO: familyDetailsDTOList){
            familyDetailsList.add(FamilyRelationDTOMapper.familyDetailsDTOtoEntity(familyDetailsDTO,customer));
        }
        return familyDetailsList;
    }
}
