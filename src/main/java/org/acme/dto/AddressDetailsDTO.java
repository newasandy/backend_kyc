package org.acme.dto;

import org.acme.dto.dtoMapper.LocationDTOMapper;
import org.acme.model.AddressDetails;
import org.acme.model.AddressType;

public class AddressDetailsDTO {

    private Long id;
    private Long customerId;
    private CountryDTO countryId;
    private DistrictDTO districtId;
    private ProvinceDTO provinceId;
    private LocalLevelDTO localLevelId;
    private String tole;
    private int ward;
    private String houseNumber;
    private AddressType addressType;

    public AddressDetailsDTO() {
    }
    public AddressDetailsDTO(AddressDetails addressDetails) {
        this.id = addressDetails.getId();
        this.customerId = addressDetails.getCustomerId().getId();
        this.countryId = LocationDTOMapper.countryEntityToDTO(addressDetails.getCountryId());
        this.districtId = LocationDTOMapper.districtEntityToDTO(addressDetails.getDistrictId());
        this.provinceId = LocationDTOMapper.provinceEntityToDTO(addressDetails.getProvinceId());
        this.localLevelId = LocationDTOMapper.localLevelEntityToDTO(addressDetails.getLocalLevelId());
        this.tole = addressDetails.getTole();
        this.ward = addressDetails.getWard();
        this.houseNumber = addressDetails.getHouseNumber();
        this.addressType = addressDetails.getAddressType();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public CountryDTO getCountryId() {
        return countryId;
    }

    public void setCountryId(CountryDTO countryId) {
        this.countryId = countryId;
    }

    public DistrictDTO getDistrictId() {
        return districtId;
    }

    public void setDistrictId(DistrictDTO districtId) {
        this.districtId = districtId;
    }

    public ProvinceDTO getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(ProvinceDTO provinceId) {
        this.provinceId = provinceId;
    }

    public LocalLevelDTO getLocalLevelId() {
        return localLevelId;
    }

    public void setLocalLevelId(LocalLevelDTO localLevelId) {
        this.localLevelId = localLevelId;
    }

    public String getTole() {
        return tole;
    }

    public void setTole(String tole) {
        this.tole = tole;
    }

    public int getWard() {
        return ward;
    }

    public void setWard(int ward) {
        this.ward = ward;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }
}
