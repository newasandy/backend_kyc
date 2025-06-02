package org.acme.dto.dtoMapper;

import org.acme.dto.FinancialDetailsDTO;
import org.acme.model.Customer;
import org.acme.model.FinancialDetails;

public class FinancialDetailsDTOMapper {
    public static FinancialDetailsDTO financialEntityToDTO(FinancialDetails financialDetails){
        return new FinancialDetailsDTO(financialDetails);
    }

    public static FinancialDetails financialDTOtoEntity(FinancialDetailsDTO financialDetailsDTO, Customer customer){
        FinancialDetails financialDetails = new FinancialDetails();
        financialDetails.setCustomerId(customer);
        financialDetails.setEducation(financialDetailsDTO.getEducation());
        financialDetails.setOccupation(financialDetailsDTO.getOccupation());
        financialDetails.setDesignation(financialDetailsDTO.getDesignation());
        financialDetails.setEmploymentType(financialDetailsDTO.getEmploymentType());
        financialDetails.setSourceOfIncome(financialDetailsDTO.getSourceOfIncome());
        financialDetails.setAnnualIncome(financialDetailsDTO.getAnnualIncome());
        financialDetails.setAnnualTransactionVolume(financialDetailsDTO.getAnnualTransactionVolume());
        return financialDetails;
    }
}
