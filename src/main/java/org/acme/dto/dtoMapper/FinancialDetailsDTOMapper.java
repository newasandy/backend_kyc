package org.acme.dto.dtoMapper;

import org.acme.dto.FinancialDetailsDTO;
import org.acme.model.FinancialDetails;

public class FinancialDetailsDTOMapper {
    public static FinancialDetailsDTO financialEntityToDTO(FinancialDetails financialDetails){
        return new FinancialDetailsDTO(financialDetails);
    }

    public static FinancialDetails financialDTOtoEntity(FinancialDetailsDTO financialDetailsDTO){
        FinancialDetails financialDetails = new FinancialDetails();
        financialDetails.setAnnualIncome(financialDetailsDTO.getAnnualIncome());
        financialDetails.setAnnualTransactionVolume(financialDetailsDTO.getAnnualTransactionVolume());
        financialDetails.setDesignation(financialDetailsDTO.getDesignation());
        financialDetails.setEducation(financialDetailsDTO.getEducation());
        financialDetails.setOccupation(financialDetailsDTO.getOccupation());
        financialDetails.setEmploymentType(financialDetailsDTO.getEmploymentType());
        financialDetails.setSourceOfIncome(financialDetailsDTO.getSourceOfIncome());
        return financialDetails;
    }
}
