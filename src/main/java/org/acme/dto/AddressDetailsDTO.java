package org.acme.dto;

import org.acme.model.AddressDetails;
import org.acme.model.AddressType;

public class AddressDetailsDTO {

    private Long id;
    private Long customerId;
    private Long countryId;
    private Long districtId;
    private Long provinceId;
    private Long localLevelId;

    private String tole;
    private int ward;
    private String houseNumber;
    private AddressType addressType;

    public AddressDetailsDTO() {
    }
    public AddressDetailsDTO(AddressDetails addressDetails) {
        this.id = addressDetails.getId();
        this.customerId = addressDetails.getCustomerId().getId();
        this.countryId = addressDetails.getCountryId().getId();
        this.districtId = addressDetails.getDistrictId().getId();
        this.provinceId = addressDetails.getProvinceId().getId();
        this.localLevelId = addressDetails.getLocalLevelId().getId();
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

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getLocalLevelId() {
        return localLevelId;
    }

    public void setLocalLevelId(Long localLevelId) {
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
