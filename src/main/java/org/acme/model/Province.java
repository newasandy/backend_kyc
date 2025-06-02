package org.acme.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "province")
public class Province extends BaseEntity{
    @Column(name = "province", nullable = false)
    private String  province;


    @OneToMany(mappedBy = "provinceId",cascade = CascadeType.ALL)
    private List<District> district;

    @OneToMany(mappedBy = "provinceId" , cascade = CascadeType.ALL)
    private List<AddressDetails> addressDetails;

    public Province(){

    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public List<District> getDistrict() {
        return district;
    }

    public void setDistrict(List<District> district) {
        this.district = district;
    }

    public List<AddressDetails> getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(List<AddressDetails> addressDetails) {
        this.addressDetails = addressDetails;
    }
}
