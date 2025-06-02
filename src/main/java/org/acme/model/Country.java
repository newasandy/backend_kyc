package org.acme.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country extends BaseEntity{

    @Column(name = "country")
    private String country;

    @OneToMany(mappedBy = "countryId", cascade = CascadeType.ALL)
    private List<AddressDetails> addressDetails;

    public Country() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<AddressDetails> getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(List<AddressDetails> addressDetails) {
        this.addressDetails = addressDetails;
    }
}
