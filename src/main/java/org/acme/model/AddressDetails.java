package org.acme.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address_details")
public class AddressDetails extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country countryId;

    @ManyToOne
    @JoinColumn(name = "district_id", nullable = false)
    private District districtId;

    @ManyToOne
    @JoinColumn(name = "province_id", nullable = false)
    private Province provinceId;

    @ManyToOne
    @JoinColumn(name = "local_level_id", nullable = false)
    private LocalLevel localLevelId;

    @Column(name = "tole", nullable = false)
    private String tole;

    @Column(name = "ward", nullable = false)
    private int ward;

    @Column(name = "house_number", nullable = false)
    private String houseNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "address_type", nullable = false)
    private AddressType addressType;

    public AddressDetails() {
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    public Province getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Province provinceId) {
        this.provinceId = provinceId;
    }

    public LocalLevel getLocalLevelId() {
        return localLevelId;
    }

    public void setLocalLevelId(LocalLevel localLevelId) {
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
