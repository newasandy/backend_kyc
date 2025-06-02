package org.acme.dto;

import org.acme.model.Country;

public class CountryDTO {

    private Long id;
    private String country;

    public CountryDTO() {
    }

    public CountryDTO(Country country){
        this.id = country.getId();
        this.country = country.getCountry();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
