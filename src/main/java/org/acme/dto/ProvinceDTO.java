package org.acme.dto;

import org.acme.model.Province;

public class ProvinceDTO {

    private Long id;
    private String  province;

    public ProvinceDTO() {
    }

    public ProvinceDTO(Province province){
        this.id = province.getId();
        this.province = province.getProvince();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
