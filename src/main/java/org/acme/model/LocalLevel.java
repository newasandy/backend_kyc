package org.acme.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "local_level")
public class LocalLevel extends BaseEntity{
    @Column(name = "local_level", nullable = false)
    private String localLevel;

    @ManyToOne
    @JoinColumn(name = "district", nullable = false)
    private District district;

    @OneToMany(mappedBy = "localLevelId", cascade = CascadeType.ALL)
    private List<AddressDetails> addressDetails;

    public LocalLevel(){
    }

    public String getLocalLevel() {
        return localLevel;
    }

    public void setLocalLevel(String localLevel) {
        this.localLevel = localLevel;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public List<AddressDetails> getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(List<AddressDetails> addressDetails) {
        this.addressDetails = addressDetails;
    }
}
