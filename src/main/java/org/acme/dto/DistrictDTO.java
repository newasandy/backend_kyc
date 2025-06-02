package org.acme.dto;

import org.acme.model.District;

public class DistrictDTO {

    private Long id;
    private String district;

    public DistrictDTO() {
    }

    public DistrictDTO(District district){
        this.id = district.getId();
        this.district = district.getDistrict();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}
