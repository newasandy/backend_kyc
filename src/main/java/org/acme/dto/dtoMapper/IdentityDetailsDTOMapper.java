package org.acme.dto.dtoMapper;

import org.acme.dto.IdentityDTO;
import org.acme.model.Customer;
import org.acme.model.IdentityDetails;

public class IdentityDetailsDTOMapper {

    public static IdentityDTO toDTO(IdentityDetails entity) {
        return new IdentityDTO(entity);
    }

    public static IdentityDetails identityDetailsDTOtoEntity(IdentityDTO dto , Customer customer) {
        if (dto == null) return null;

        IdentityDetails entity = new IdentityDetails();
        entity.setCustomerId(customer);
        entity.setDocumentType(dto.getDocumentType());
        entity.setNationality(dto.getNationality());
        entity.setBirthPlace(dto.getBirthPlace());
        entity.setPlaceOfIssue(dto.getPlaceOfIssue());
        entity.setIdentityNumber(dto.getIdentityNumber());
        entity.setIssueDate(dto.getIssueDate());
        entity.setAuthority(dto.getAuthority());

        return entity;
    }

}
